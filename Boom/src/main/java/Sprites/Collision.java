package Sprites;

import Sprites.Bomb.Bomb;
import Sprites.Bomb.Fire;
import Sprites.Boomber.Boomber;
import Sprites.Dormant.Box;
import Sprites.Dormant.Dormant;
import Sprites.Dormant.Ground;
import Sprites.Dormant.Stone;
import Sprites.Enemies.Bum;
import Sprites.Enemies.Enemy;
import Sprites.Item.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Collision {
	//
	public static int MainVsEnemy(Boomber boomber, Enemy enemy){
		Rectangle rec1=new Rectangle(boomber.getX()+5,boomber.getY()+5,boomber.getWidth()-10,boomber.getHeight()-10);
		Rectangle rec2=new Rectangle(enemy.getX()+3,enemy.getY()+3,enemy.getWidth()-6,enemy.getHeight()-6);
		if(rec1.intersects(rec2)){
			return 1;
		}
		return 0;
	}
	//
	public static int MainVsDormant(Boomber boomber,Dormant dormant){
		Rectangle rec1=new Rectangle(dormant.getX(),dormant.getY(),dormant.getWidth(),dormant.getHeight());
		Rectangle rec2=new Rectangle(boomber.getX()+3,boomber.getY()+3,boomber.getWidth()-6,boomber.getHeight()-6);
		if(rec2.intersects(rec1)){
			return 1;
		}
		return 0;
	}
	//
	public static int MainVsItem(Boomber boomber, Item item){
		Rectangle rec1=new Rectangle(boomber.getX()+5,boomber.getY()+5,boomber.getWidth()-10,boomber.getHeight()-5);
		Rectangle rec2=new Rectangle(item.getX()+3,item.getY()+3,item.getWidth()-6,item.getHeight()-6);
		if(rec1.intersects(rec2)){
			if(item instanceof Speed){
				int n=boomber.getSpeed();
				boomber.setSpeed(n+1);
				return 1;
			}
			if(item instanceof Flame){
				boomber.setDame(boomber.getDame()+1);
				return 1;
			}
			if(item instanceof MultiBomb){
				boomber.setNumber(boomber.getNumber()+1);
				return 1;
			}
			if(item instanceof Heart){
				boomber.setHeart(boomber.getHeart()+1);
				return 1;
			}
			if(item instanceof Pass){
				return 1;
			}
		}
		return 0;
	}
	//
	public static int MainVsBum(Boomber boomber, Bum bum){
		Rectangle rec=new Rectangle(boomber.getX()+14,boomber.getY()+10,boomber.getWidth()-28,boomber.getHeight()-20);
		Rectangle up=new Rectangle(bum.getX()+10,bum.getY()-45,10,45);
		Rectangle down=new Rectangle(bum.getX()+10,bum.getY()+40,10,45);
		Rectangle left=new Rectangle(bum.getX()-45,bum.getY()+10,45,10);
		Rectangle right=new Rectangle(bum.getX()+30,bum.getY()+10,45,10);
		if(up.intersects(rec)){
			bum.setSpeedy(-2);
			bum.setSpeedx(0);
			return 0;
		}
		if(down.intersects(rec)){
			bum.setSpeedy(2);
			bum.setSpeedx(0);
			return 0;
		}
		if(left.intersects(rec)){
			bum.setSpeedy(0);
			bum.setSpeedx(-2);
			return 0;
		}
		if(right.intersects(rec)){
			bum.setSpeedy(0);
			bum.setSpeedx(2);
			return 0;
		}
		return 0;
	}
	//
	public static void BombVsMain(Boomber boomber,Bomb bomb){
		/*Rectangle rec1=new Rectangle(boomber.getX()+3,boomber.getY()+3, boomber.getWidth()-6,boomber.getHeight()-6);
		for(Bomb bomb:bombs){
			Rectangle rec2=new Rectangle(bomb.getX(),bomb.getY(),bomb.getWidth(),bomb.getHeight());
			if((rec1.intersects(rec2))==false){
				bomb.can=false;
			}
			if(rec1.intersects(rec2)&&bomb.can==false){
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
		}*/
	}
	//
	public static int BumVsEnemy(Bum bum,Enemy enemy){
		Rectangle rec1=new Rectangle(bum.getX(),bum.getY(),bum.getWidth(),bum.getHeight());
		Rectangle rec2=new Rectangle(enemy.getX(),enemy.getY(),bum.getWidth(),bum.getHeight());
		if(rec1.intersects(rec2)&&bum.getSpeedx()>0){
			bum.setSpeedx(3);
			bum.setSpeedy(0);
			return 0;
		}
		if(rec1.intersects(rec2)&&bum.getSpeedx()<0){
			bum.setSpeedx(-3);
			bum.setSpeedy(0);
			return 0;
		}
		if(rec1.intersects(rec2)&&bum.getSpeedy()>0){
			bum.setSpeedx(0);
			bum.setSpeedy(3);
			return 0;
		}
		if(rec1.intersects(rec2)&&bum.getSpeedy()<0){
			bum.setSpeedx(0);
			bum.setSpeedy(-3);
			return 0;
		}
		return 0;
	}
	public static int EnemyVsDormant(Enemy enemy,Dormant dormant){
		Rectangle rec=new Rectangle(dormant.getX(),dormant.getY(),dormant.getWidth(),dormant.getHeight());
		Rectangle recUp=new Rectangle(enemy.getX()+10,enemy.getY(),enemy.getWidth()-20,1);
		Rectangle recDown=new Rectangle(enemy.getX()+10,enemy.getY()+enemy.getHeight()-1,enemy.getWidth()-20,1);
		Rectangle recRight=new Rectangle(enemy.getX()+enemy.getWidth()-1,enemy.getY()+10,1,enemy.getHeight()-20);
		Rectangle recLeft=new Rectangle(enemy.getX(),enemy.getY()+10,1,enemy.getHeight()-20);
		Random random=new Random();
		int a=enemy.getSpeed();
		int n=random.nextInt(2)*a;
		int k=random.nextInt(2);
		int m = 0;
		int m1=0;
		if(k==0){
			m=a-n;
			m1=a;
		}
		else {
			if(k==1){
				m=n-a;
				m1=-a;
			}
		}
		if(recUp.intersects(rec)&&enemy.getSpeedy()<0){
			enemy.setSpeedy(n);
			enemy.setSpeedx(m);
			return 1;
		}
		if(recDown.intersects(rec)&&enemy.getSpeedy()>0){
			enemy.setSpeedy(-n);
			enemy.setSpeedx(m);
			return 1;
		}
		if(recLeft.intersects(rec)&&enemy.getSpeedx()<0){
			enemy.setSpeedx(n);
			enemy.setSpeedy(m);
			return 1;
		}
		if(recRight.intersects(rec)&&enemy.getSpeedx()>0){
			enemy.setSpeedx(-n);
			enemy.setSpeedy(m);
			return 1;
		}
		int x=((enemy.getX()+15)/45)*45;
		int y=((enemy.getY()+20)/45)*45;
		int x1=random.nextInt(15)*2*45+45;
		int y1=random.nextInt(8)*2*45-45;
		//int x1=270;
		//int y1=225;
		int l=random.nextInt(35);
		int d=0;
		if(l==30){
			d=1;
		}
		else{
			d=0;
		}
		Rectangle recR=new Rectangle(x1,y,d,45);
		Rectangle recL=new Rectangle(x1+44,y,d,45);
		Rectangle recU=new Rectangle(x,y1+44,45,d  );
		Rectangle recD=new Rectangle(x,y1,45,d);
		if(recRight.intersects(recR)&&enemy.getSpeedx()>0){
			enemy.setSpeedx(0);
			enemy.setSpeedy(m1);
			return 1;
		}
		if(recLeft.intersects(recL)&&enemy.getSpeedx()<0){
			enemy.setSpeedx(0);
			enemy.setSpeedy(m1);
			return 1;
		}
		if(recDown.intersects(recD)&&enemy.getSpeedy()>0){
			enemy.setSpeedy(0);
			enemy.setSpeedx(m1);
			return 1;
		}
		if(recUp.intersects(recU)&&enemy.getSpeedy()<0){
			enemy.setSpeedy(0);
			enemy.setSpeedx(m1);
			return 1;
		}
		return 0;
	}
	//
	public static int EnemyVsBomb(Enemy enemy,Bomb bomb){
		Rectangle rec=new Rectangle(bomb.getX(),bomb.getY(),bomb.getWidth(),bomb.getHeight());
		Rectangle recUp=new Rectangle(enemy.getX()+10,enemy.getY(),enemy.getWidth()-20,1);
		Rectangle recDown=new Rectangle(enemy.getX()+10,enemy.getY()+enemy.getHeight()-1,enemy.getWidth()-20,1);
		Rectangle recRight=new Rectangle(enemy.getX()+enemy.getWidth()-1,enemy.getY()+10,1,enemy.getHeight()-20);
		Rectangle recLeft=new Rectangle(enemy.getX(),enemy.getY()+10,1,enemy.getHeight()-20);
		Random random=new Random();
		int k=random.nextInt(2);
		int m=0;
		if(k==0){
			m=1;
		}
		if(k==1){
			m=-1;
		}
		if(recUp.intersects(rec)&&enemy.getSpeedy()<0){
			enemy.setSpeedy(0);
			enemy.setSpeedx(m);
			return 0;
		}
		if(recDown.intersects(rec)&&enemy.getSpeedy()>0){
			enemy.setSpeedy(0);
			enemy.setSpeedx(m);
			return 0;
		}
		if(recLeft.intersects(rec)&&enemy.getSpeedx()<0){
			enemy.setSpeedx(0);
			enemy.setSpeedy(m);
			return 0;
		}
		if(recRight.intersects(rec)&&enemy.getSpeedx()>0){
			enemy.setSpeedx(0);
			enemy.setSpeedy(m);
			return 0;
		}
		return 0;
	}
	//
	public static void BombVsDormant(Bomb bomb,ArrayList<Dormant> dormants){
		Rectangle recUp=new Rectangle(bomb.getX(),bomb.getY()-45*bomb.getDame(),bomb.getWidth(),bomb.getHeight()*bomb.getDame());
		Rectangle recDown=new Rectangle(bomb.getX(),bomb.getY()+45,bomb.getWidth(),bomb.getHeight()*bomb.getDame());
		Rectangle recLeft=new Rectangle(bomb.getX()-45*bomb.getDame(),bomb.getY(),bomb.getWidth()*bomb.getDame(),bomb.getHeight());
		Rectangle recRight=new Rectangle(bomb.getX()+45,bomb.getY(),bomb.getWidth()*bomb.getDame(),bomb.getHeight());
		for(Dormant dormant:dormants){
			if((dormant instanceof Ground)==false){
				Rectangle rec=new Rectangle(dormant.getX(),dormant.getY(),dormant.getWidth(),dormant.getHeight());
				if(recUp.intersects(rec)){
					int n=(bomb.getY()-dormant.getY())/45;
					if(n<bomb.up) bomb.up=n;
				}
				if(recDown.intersects(rec)){
					int n=(dormant.getY()-bomb.getY())/45;
					if(n<bomb.down) bomb.down=n;
				}
				if(recLeft.intersects(rec)){
					int n=(bomb.getX()-dormant.getX())/45;
					if(n<bomb.left) bomb.left=n;
				}
				if(recRight.intersects(rec)){
					int n=(dormant.getX()-bomb.getX())/45;
					if(n<bomb.right) bomb.right=n;
				}
			}
		}
	}
	//
	public static int BombVsBox(Bomb bomb,Box box) {
		Rectangle rec = new Rectangle(box.getX(), box.getY(), box.getWidth(), box.getHeight());
		Rectangle recUp = new Rectangle(bomb.getX(), bomb.getY() - 45*bomb.up, bomb.getWidth(), bomb.getHeight() * bomb.up);
		Rectangle recDown = new Rectangle(bomb.getX(), bomb.getY() + 45, bomb.getWidth(), bomb.getHeight() * bomb.down);
		Rectangle recLeft = new Rectangle(bomb.getX() - 45*bomb.left, bomb.getY(), bomb.getWidth() * bomb.left, bomb.getHeight());
		Rectangle recRight = new Rectangle(bomb.getX() + 45, bomb.getY(), bomb.getWidth() * bomb.right, bomb.getHeight());
		if ((recUp.intersects(rec) || recDown.intersects(rec) || recRight.intersects(rec) || recLeft.intersects(rec)) && bomb.getTime() <= 5) {
			return 1;
		}
		return 0;
	}
	//
	public static int BombVsBomb(Bomb bomb1,Bomb bomb2){
		Rectangle recUp = new Rectangle(bomb1.getX(), bomb1.getY() - 45*bomb1.up, bomb1.getWidth(), bomb1.getHeight() * bomb1.up);
		Rectangle recDown = new Rectangle(bomb1.getX(), bomb1.getY() + 45, bomb1.getWidth(), bomb1.getHeight() * bomb1.down);
		Rectangle recLeft = new Rectangle(bomb1.getX() - 45*bomb1.left, bomb1.getY(), bomb1.getWidth() * bomb1.left, bomb1.getHeight());
		Rectangle recRight = new Rectangle(bomb1.getX() + 45, bomb1.getY(), bomb1.getWidth() * bomb1.right, bomb1.getHeight());
		Rectangle rec=new Rectangle(bomb2.getX(),bomb2.getY(),bomb2.getWidth(),bomb2.getHeight());
		if ((recUp.intersects(rec) || recDown.intersects(rec) || recRight.intersects(rec) || recLeft.intersects(rec)) && bomb1.getTime()==10) {
			return 1;
		}
		return 0;
	}
	//
	public static int BombVsEnemy(Bomb bomb1,Enemy enemy){
		Rectangle recUp = new Rectangle(bomb1.getX(), bomb1.getY() - 45*bomb1.up, bomb1.getWidth(), bomb1.getHeight() * bomb1.up);
		Rectangle recDown = new Rectangle(bomb1.getX(), bomb1.getY() + 45, bomb1.getWidth(), bomb1.getHeight() * bomb1.down);
		Rectangle recLeft = new Rectangle(bomb1.getX() - 45*bomb1.left, bomb1.getY(), bomb1.getWidth() * bomb1.left, bomb1.getHeight());
		Rectangle recRight = new Rectangle(bomb1.getX() + 45, bomb1.getY(), bomb1.getWidth() * bomb1.right, bomb1.getHeight());
		Rectangle rec=new Rectangle(enemy.getX()+5,enemy.getY()+10,enemy.getWidth()-10,enemy.getHeight()-20);
		if ((recUp.intersects(rec) || recDown.intersects(rec) || recRight.intersects(rec) || recLeft.intersects(rec)) && bomb1.getTime()<=10) {
			return 1;
		}
		return 0;
	}
	//
	public static int MainVsBomb(Boomber boomber,Bomb bomb1){
		Rectangle recCenter=new Rectangle(bomb1.getX(),bomb1.getY(),bomb1.getWidth(),bomb1.getHeight());
		Rectangle recUp = new Rectangle(bomb1.getX(), bomb1.getY() - 45*bomb1.up, bomb1.getWidth(), bomb1.getHeight() * bomb1.up);
		Rectangle recDown = new Rectangle(bomb1.getX(), bomb1.getY() + 45, bomb1.getWidth(), bomb1.getHeight() * bomb1.down);
		Rectangle recLeft = new Rectangle(bomb1.getX() - 45*bomb1.left, bomb1.getY(), bomb1.getWidth() * bomb1.left, bomb1.getHeight());
		Rectangle recRight = new Rectangle(bomb1.getX() + 45, bomb1.getY(), bomb1.getWidth() * bomb1.right, bomb1.getHeight());
		Rectangle rec=new Rectangle(boomber.getX()+5,boomber.getY()+5,boomber.getWidth()-10,boomber.getHeight()-10);
		if ((recCenter.intersects(rec)||recUp.intersects(rec) || recDown.intersects(rec) || recRight.intersects(rec) || recLeft.intersects(rec)) && bomb1.getTime()<=10) {
			return 1;
		}
		return 0;
	}
	//
	public static int FireVsDormant(Fire fire,Dormant dormant){
		Rectangle rec1=new Rectangle(fire.getX()+3,fire.getY()+3,fire.getWidth()-6,fire.getHeight()-6);
		Rectangle rec2=new Rectangle(dormant.getX(),dormant.getY(),dormant.getWidth(),dormant.getHeight());
		if(rec1.intersects(rec2)){
			return 1;
		}
		return 0;
	}
	public static int FireVsMain(Fire fire,Boomber boomber){
		Rectangle rec1=new Rectangle(fire.getX()+3,fire.getY()+3,fire.getWidth()-6,fire.getHeight()-6);
		Rectangle rec2=new Rectangle(boomber.getX()+5,boomber.getY()+5,boomber.getWidth()-10,boomber.getHeight()-10);
		if(rec1.intersects(rec2)){
			return 1;
		}
		return 0;
	}
}
