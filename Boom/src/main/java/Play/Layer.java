package Play;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import File.FileTxt;
import File.Sound;
import Play.Menu.GameOver;
import Play.Menu.Map;
import Play.Menu.Win;
import Sprites.*;
import Sprites.Bomb.Bomb;
import Sprites.Bomb.Die;
import Sprites.Bomb.Fire;
import Sprites.Boomber.Boomber;
import Sprites.Boomber.Main;
import Sprites.Dormant.*;
import Sprites.Dormant.Box;
import Sprites.Enemies.*;
import Sprites.Item.*;

import javax.swing.*;
//Lớp quan trọng chứa tất cả dữ liệu màn chơi
public class Layer extends JPanel implements KeyListener {
	//Mảng chứa tất cả các nhân vật
	public ArrayList<Sprite> sprites;
	//Mảng chứa dữ liệu màn chơi
	public int[][] level;
	protected int mainx,mainy;//Tọa độ ban đầu của main.
	protected int number;//Số bomb được đặt
	public static boolean pass;//Qua màn
	public static int lv;//Màn đang chơi
	int heart=0;
	int speed=0;
	int flame=0;
	int multi=0;
	Sound bombbang=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\bombbang.wav");
	Sound enemydie=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\enemydie.wav");
	Sound bomberdie=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\bomberdie.wav");
	Sound item=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\item.wav");

	public Layer(int w,int h){
		sprites=new ArrayList<Sprite>();
		pass=false;
		lv=1;
		addKeyListener(this);
		level=Level.level[lv];
		LoadLevel();
		number=setNumber();

		Color color=new Color(10, 5, 9);
		setBackground(color);
		setBounds(0,0,w,h);
	}
	public int setNumber() {
		for (Sprite sprite : sprites) {
			if (sprite instanceof Boomber) {
				Boomber boomber = (Boomber) sprite;
				return boomber.getNumber();//đa hình
			}
		}
		return 0;
	}
	public static void setLv(int level){
		pass=true;
		lv=level;
	}
	public static int getLv(){
		return lv;
	}
	public void addSprite(Sprite spr){
		sprites.add(spr);
	}//Đa hình
	public void removeSprite(Sprite spr){ sprites.remove(spr);}//Đa hình
	public void removeBomb(){
		ArrayList<Bomb> bombs=new ArrayList<Bomb>();
		for(Sprite sprite:sprites){
			if(sprite instanceof Bomb){
				Bomb bomb=(Bomb) sprite;
				bombs.add(bomb);
			}
		}
		for(Bomb bomb:bombs){
			if(bomb.getTime()<=10&&bomb.getTime()>0){
				bombbang.play();
				bombbang.reset();
			}
			if(bomb.getTime()==0){
				removeSprite(bomb);
				number++;
			}
		}
	}
	public void removeDie(){
		ArrayList<Die> dies=new ArrayList<Die>();
		for(Sprite sprite:sprites){
			if(sprite instanceof Die){
				Die die=(Die) sprite;
				dies.add(die);
			}
		}
		for(Die die:dies){
			if(die.getTimeline()==0) {
				removeSprite(die);
			}
		}
	}
	public void moveTo(){
		if(pass){
			sprites.clear();
			level=Level.level[lv];
			LoadLevel();
			number=setNumber();
			bombbang.reset();
			bomberdie.reset();
			item.reset();
			enemydie.reset();
			pass=false;
		}
		for(int i=0;i<sprites.size();i++){
			sprites.get(i).moveTo();
		}
		this.repaint();
	}
	//Phương thức để vẽ ra màn chơi
	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Enemy.doAnimation();
		AllCollision();
		for(int i=0;i<sprites.size();i++){
			Sprite sprite=sprites.get(i);
			if(sprite instanceof Die){
				Die die=(Die) sprite;
				die.deadLine();//Chạy giây đếm ngược
			}
			if(sprite instanceof Bomb){
				Bomb bomb=(Bomb) sprite;
				bomb.deadLine();//Chạy giây đếm ngược
			}
		}
		removeBomb();
		removeDie();

		Image level=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Game_GUI\\headlines\\level.png").getImage();
		Image iconspeed=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Icon\\speed.png").getImage();
		Image iconmulti=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Icon\\multibomb.png").getImage();
		Image iconflame=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Icon\\flame.png").getImage();
		Image iconheart=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Icon\\heart.png").getImage();
		Image number0=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (1).png").getImage();
		Image number1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (2).png").getImage();
		Image number2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (3).png").getImage();
		Image number3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (4).png").getImage();
		Image number4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (5).png").getImage();
		Image number5=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (6).png").getImage();
		Image number6=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (7).png").getImage();
		Image number7=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (8).png").getImage();
		Image number8=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (9).png").getImage();
		Image number9=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number\\number (10).png").getImage();
		Image[] number=new Image[]{number0,number1,number2,number3,number4,number5,number6,number7,number8,number9};
		g.drawImage(level,10,5,this);
		g.drawImage(number[lv],120,5,this);

		for(int i=0;i<sprites.size();i++) {
			if (sprites.get(i) instanceof Boomber) {
				Boomber boomber = (Boomber) sprites.get(i);
				heart = boomber.getHeart();
				speed = boomber.getSpeed();
				flame = boomber.getDame();
				multi = boomber.getNumber();
			}
		}
		g.drawImage(iconheart,500,5,this);
		g.drawImage(number[heart],540,5,this);
		g.drawImage(iconflame,640,5,this);
		g.drawImage(number[flame],680,5,this);
		g.drawImage(iconspeed,780,5,this);
		g.drawImage(number[speed],820,5,this);
		g.drawImage(iconmulti,920,5,this);
		g.drawImage(number[multi],960,5,this);


		Graphics2D g2d=(Graphics2D) g;
		for(int i=0;i<sprites.size();i++){
			Sprite sprite=sprites.get(i);
			if(sprite instanceof Ground){
				Ground ground=(Ground) sprite;
				ground.draw(g2d,this);
			}
		}
		for(Sprite sprite:sprites){
			if(sprite instanceof Item||sprite instanceof Box){
				sprite.draw(g2d,this);//Đa hình
			}
		}
		for(Sprite sprite:sprites){
			if(sprite instanceof Enemy){
				sprite.draw(g2d,this);
			}
		}
		for(int i=sprites.size()-1;i>=0;i--){
			if(sprites.get(i) instanceof Bomb||sprites.get(i) instanceof Fire){
				sprites.get(i).draw(g2d,this);
			}
		}
		for(int i=0;i<sprites.size();i++){
			Sprite sprite=sprites.get(i);
			if(sprite instanceof Wall ||sprite instanceof Die||sprite instanceof Stone){
				sprite.draw(g2d,this);
			}
		}
		for(Sprite sprite:sprites){
			if(sprite instanceof Boomber ){
				sprite.draw(g2d,this);
			}
		}
	}
	//Load nhân vật , đối tượng chỉ thực hiện một lần khi tạo layer
	public void LoadLevel(){
		int x=0,y=45;
		int i,j;
		Random random=new Random();
		int n=random.nextInt(4);
		for(i=0;i<15;i++){
			for(j=0;j<30;j++){
				if(level[i][j]==0){
					Ground ground=new Ground(x,y,n);
					addSprite(ground);
					x=x+45;
				}
				if(level[i][j]!=0){
					Ground ground=new Ground(x,y,n);
					addSprite(ground);
				}
				if(level[i][j]==1){
					Wall wall =new Wall(x,y,n);
					addSprite(wall);
					x=x+45;
				}
				if(level[i][j]==2){
					Pass pass=new Pass(x+7,y+7);
					addSprite(pass);
					Box box=new Box(x,y,n);
					addSprite(box);
					x=x+45;
				}
				if(level[i][j]==3){
					int m=random.nextInt(41);
					if(m==10){
						Speed speed=new Speed(x+8,y+8);
						addSprite(speed);
					}
					if(m==20){
						Flame flame=new Flame(x+8,y+8);
						addSprite(flame);
					}
					if(m==30){
						MultiBomb bomb=new MultiBomb(x+8,y+8);
						addSprite(bomb);
					}
					if(m==40){
						Heart heart=new Heart(x+8,y+8);
						addSprite(heart);
					}
					Box box=new Box(x,y,n);
					addSprite(box);
					x=x+45;
				}
				if(level[i][j]==4){
					Stone stone=new Stone(x,y,n);
					addSprite(stone);
					x=x+45;
				}
				if(level[i][j]==9){
					Main main=new Main(x,y,4,1,1,2,3);
					addSprite(main);
					mainx=x;
					mainy=y;
					Begin begin=new Begin(x,y,0);
					addSprite(begin);
					x=x+45;
				}
				if(level[i][j]==8){
					Monster monster=new Monster(x,y,1,0);
					addSprite(monster);
					x=x+45;
				}
				if(level[i][j]==7){
					Bum bum =new Bum(x,y,1,1);
					addSprite(bum);
					x=x+45;
				}
				if(level[i][j]==6){
					Tank tank =new Tank(x,y,2,2);
					addSprite(tank);
					x=x+45;
				}
			}
			x=0;
			y=y+45;
		}
	}
	public void AllCollision(){
		ArrayList<Enemy> enemies=new ArrayList<Enemy>();
		ArrayList<Dormant> dormants=new ArrayList<Dormant>();
		ArrayList<Boomber> boombers=new ArrayList<Boomber>();
		ArrayList<Item> items=new ArrayList<Item>();
		ArrayList<Bomb> bombs=new ArrayList<Bomb>();
		ArrayList<Fire> fires=new ArrayList<Fire>();
		for(int i=0;i<sprites.size();i++){
			Sprite sprite=sprites.get(i);
			if(sprite instanceof Boomber){
				Boomber boomber=(Boomber) sprite;
				boombers.add(boomber);
			}
			if(sprite instanceof Enemy){
				Enemy enemy=(Enemy) sprite;
				enemies.add(enemy);
			}
			if(sprite instanceof Dormant){
				Dormant dormant=(Dormant) sprite;
				dormants.add(dormant);
			}
			if(sprite instanceof Item){
				Item item=(Item) sprite;
				items.add(item);
			}
			if(sprite instanceof Bomb){
				Bomb bomb=(Bomb) sprite;
				bombs.add(bomb);
			}
			if(sprite instanceof Fire){
				Fire fire=(Fire) sprite;
				fires.add(fire);
			}
		}
		//Va chạm giữa bomber và enemy
		for(Boomber boomber:boombers){
			for(Enemy enemy:enemies){
				if(Collision.MainVsEnemy(boomber,enemy)==1){
					int x=((boomber.getX()+20)/45)*45;
					int y=((boomber.getY()+35)/45)*45;
					bomberdie.play();
					bomberdie.reset();
					Die die=new Die(x,y);
					addSprite(die);
					boomber.setHeart(boomber.getHeart()-1);
					Main main=new Main();
					if(boomber.getNumber()>main.getNumber()){
						this.number-=1;
						boomber.setNumber(boomber.getNumber()-1);
					}
					if(boomber.getDame()>main.getDame()) boomber.setDame(boomber.getDame()-1);
					if(boomber.getSpeed()>main.getSpeed()) boomber.setSpeed(boomber.getSpeed()-1);
					if(boomber.getHeart()==0){
						heart=0;
						removeSprite(boomber);
						new GameOver();
					}
					boomber.setX(mainx);
					boomber.setY(mainy);
				}
				if(enemy instanceof Bum){
					Bum bum=(Bum) enemy;
					Collision.MainVsBum(boomber,bum);
				}
			}
		}
		//Va chạm giữa bomber và item
		for(Boomber boomber:boombers){
			for(Item item:items){
				if(Collision.MainVsItem(boomber,item)==1){
					this.item.play();
					this.item.reset();
					if(item instanceof MultiBomb) number+=1;
					if(item instanceof Pass &&enemies.size()==0){
						//pass=true;
						//lv++;
						removeSprite(item);
						removeSprite(boomber);
						ArrayList<String> temp=new ArrayList<String>();
						FileTxt.ReadFile("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\java\\File\\Level.txt",temp);
						try{
							temp.remove(getLv());
							temp.add(getLv(),"t");
							FileTxt.WriteIntoFile("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\java\\File\\Level.txt",temp);
						}catch(Exception e1){
							System.out.println("ERROR");
						}
						Diagram.Remove("Map");
						Diagram.c.add("Map",new Map(Diagram.Width,Diagram.Height));
						new Win();
					}
					if((item instanceof Pass)==false) removeSprite(item);
				}
			}
		}
		//Va chạm giữa bomber và bomb
		for(Boomber boomber:boombers){
			Collision.BombVsMain(boomber,bombs);
			for(Bomb bomb:bombs){
				if(Collision.MainVsBomb(boomber,bomb)==1){
					int x=((boomber.getX()+20)/45)*45;
					int y=((boomber.getY()+35)/45)*45;
					bomberdie.play();
					bomberdie.reset();
					Die die=new Die(x,y);
					addSprite(die);
					boomber.setX(mainx);
					boomber.setY(mainy);
					boomber.setHeart(boomber.getHeart()-1);
					Main main=new Main();
					if(boomber.getNumber()>main.getNumber()){
						this.number-=1;
						boomber.setNumber(boomber.getNumber()-1);
					}
					if(boomber.getDame()>main.getDame()) boomber.setDame(boomber.getDame()-1);
					if(boomber.getSpeed()>main.getSpeed()) boomber.setSpeed(boomber.getSpeed()-1);
					if(boomber.getHeart()==0){
						heart=0;
						removeSprite(boomber);
						new GameOver();
					}
				}
			}
		}
		//Va chạm giữa bomb và enemy
		for(Bomb bomb:bombs){
			for(Enemy enemy:enemies){
				if(Collision.BombVsEnemy(bomb,enemy)==1){
					int x = ((enemy.getX()+15)/ 45) * 45;
					int y = ((enemy.getY()+20) / 45) * 45;
					enemydie.play();
					enemydie.reset();
					removeSprite(enemy);
					Die die=new Die(x,y);
					addSprite(die);
				}
			}
		}
		//Va chạm giữa enemy và dormant
		for(Enemy enemy:enemies){
			for(Dormant dormant:dormants){
				if((dormant instanceof Ground)==false){
					Collision.EnemyVsDormant(enemy,dormant);
				}
			}
		}
		//Va chạm giữa enemy và bomb
		for(Bomb bomb:bombs){
			for(Enemy enemy:enemies){
				Collision.EnemyVsBomb(enemy,bomb);
			}
		}
		//Va chạm giữa  bum và enemy
		for(Enemy enemy:enemies){
			if(enemy instanceof Bum){
				Bum bum=(Bum) enemy;
				for(Enemy enemy1:enemies){
					if((enemy1 instanceof Bum)==false){
						Collision.BumVsEnemy(bum,enemy1);
					}
				}
			}
		}
		//Va chạm giữa bomb và bomb
		for(int j=0;j<bombs.size()-1;j++){
			if(bombs.size()>=2){
				if(Collision.BombVsBomb(bombs.get(j),bombs.get(j+1))==1){
					bombs.get(j+1).setTimeline(10);
				}
			}
		}
		//Va chạm giữa bomber và dormant
		for(Boomber boomber:boombers){
			for(Dormant dormant:dormants){
				if((dormant instanceof Ground)==false&&(dormant instanceof Begin)==false){
					if(Collision.MainVsDormant(boomber,dormant)==1) {
						if(boomber.getSpeedx()>0){
							boomber.setX(boomber.getX()-boomber.getSpeed());
						}
						if(boomber.getSpeedx()<0){
							boomber.setX(boomber.getX()+boomber.getSpeed());
						}
						if(boomber.getSpeedy()>0){
							boomber.setY(boomber.getY()-boomber.getSpeed());
						}
						if(boomber.getSpeedy()<0){
							boomber.setY(boomber.getY()+boomber.getSpeed());
						}
					}
				}
			}
		}
		//Va chạm giữa bomb và dormant
		for(Bomb bomb:bombs){
			Collision.BombVsDormant(bomb,dormants);
			for(Dormant dormant:dormants){
				if(dormant instanceof Box){
					Box box=(Box) dormant;
					if(Collision.BombVsBox(bomb,box)==1){
						removeSprite(box);
					}
				}
			}
		}
		//Va chạm giữa đạn và dormant
		for(Fire fire:fires){
			for(Dormant dormant:dormants){
				if((dormant instanceof Ground)==false){
					if(Collision.FireVsDormant(fire,dormant)==1){
						removeSprite(fire);
					}
				}
			}
		}
		//Va cham giữa đạn và main
		for(Boomber boomber:boombers){
			for(Fire fire:fires){
				if(Collision.FireVsMain(fire,boomber)==1){
					removeSprite(fire);
					int x=((boomber.getX()+20)/45)*45;
					int y=((boomber.getY()+35)/45)*45;
					bomberdie.play();
					bomberdie.reset();
					Die die=new Die(x,y);
					addSprite(die);
					boomber.setX(mainx);
					boomber.setY(mainy);
					boomber.setHeart(boomber.getHeart()-1);
					Main main=new Main();
					if(boomber.getNumber()>main.getNumber()){
						this.number-=1;
						boomber.setNumber(boomber.getNumber()-1);
					}
					if(boomber.getDame()>main.getDame()) boomber.setDame(boomber.getDame()-1);
					if(boomber.getSpeed()>main.getSpeed()) boomber.setSpeed(boomber.getSpeed()-1);
					if(boomber.getHeart()==0){
						heart=0;
						removeSprite(boomber);
						new GameOver();
					}
				}
			}
		}
		//
		for(Enemy enemy:enemies) {
			if (enemy instanceof Tank) {
				Tank tank = (Tank) enemy;
				for (Dormant dormant : dormants) {
					if ((dormant instanceof Ground) == false) {
						if (Collision.EnemyVsDormant(tank, dormant) == 1) {
							if (tank.getSpeedx() > 0) {
								Fire fire = new Fire(tank.getX() + tank.getWidth(), tank.getY() + 12, 3, 0);
								addSprite(fire);
							}
							if (tank.getSpeedx() < 0) {
								Fire fire = new Fire(tank.getX() - 20, tank.getY() + 12, -3, 0);
								addSprite(fire);
							}
							if (tank.getSpeedy() > 0) {
								Fire fire = new Fire(tank.getX() + 12, tank.getY() + tank.getHeight(), 0, 3);
								addSprite(fire);
							}
							if (tank.getSpeedy() < 0) {
								Fire fire = new Fire(tank.getX() + 12, tank.getY() - 20, 0, -3);
								addSprite(fire);
							}
						}
					}
				}
			}
		}
	}
	//Ngoại lệ ConcurrentModificationException sinh ra khi đang duyệt mảng theo vòng lặp for each mà ta thêm phần tử vào mảng
	public void keyTyped(KeyEvent e) {
		int x = 0,y=0,dame=0;
		if (e.getKeyChar() == KeyEvent.VK_SPACE) {
			for (Sprite sprite : sprites) {
				if (sprite instanceof Boomber) {
					Boomber boomber = (Boomber) sprite;
					x=boomber.getX()+15;
					y=boomber.getY()+20;
					dame=boomber.getDame();//Đa hình
				}
			}
			Bomb bomb = new Bomb((x/45)*45, (y/45)*45,dame);
			//Mỗi lần ấn dấu cách mà number còn lớn hơn không thì được phép đặt bom.
			if(number>0) {
				number--;
				addSprite(bomb);
			}
		}
		if(e.getKeyChar()==KeyEvent.VK_ESCAPE){
			bombbang.stop();
			bomberdie.stop();
			item.stop();
			enemydie.stop();
			Diagram.game.stop();
			Diagram.background.reset();
			Diagram.background.loop();
			Diagram.Show("Extra Menu");
		}
	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {

	}
}
