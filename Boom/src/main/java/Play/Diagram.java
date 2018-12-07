package Play;

import File.Sound;
import Play.Menu.ExtraMenu;
import Play.Menu.Map;
import Play.Menu.Menu;
import Play.Menu.Option;
import Sprites.Boomber.Boomber;
import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//Lớp hiển thị ra màn hình
public class Diagram extends JFrame {
	public static int Width=1360;
	public static int Height=755;
	public static Layer layer=new Layer(Width,Height);
	protected Play.Menu.Menu menu=new Menu(Width,Height);
	public static Map map=new Map(Width,Height);
	protected Option option=new Option(Width,Height);
	protected ExtraMenu extraMenu=new ExtraMenu(Width,Height);
	public static Container c;
	public static CardLayout card=new CardLayout();
	public static Sound background=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\background.wav");
	public static Sound game=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\play.wav");

	public Diagram(int w,int h){
		setTitle("BOOM BOOM!!!");
		addKeyListener(new KAdapter());

		c=getContentPane();
		c.setLayout(card);

		c.add("Menu",menu);
		c.add("Map",map);
		c.add("Play Game",layer);
		c.add("Option",option);
		c.add("Extra Menu",extraMenu);
		background.loop();

		setSize(w,h);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void Show(String s){
		card.show(c,s);
	}
	public void moveLayer(){
		while(true){
			layer.moveTo();
			try{
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void Remove(String s){
		if(s.equals("Map")){
			c.remove(map);
		}
		if(s.equals("Play Game")){
			c.remove(layer);
		}
	}

	class KAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			for(Sprite sprite:layer.sprites){
				if(sprite instanceof Boomber){
					Boomber boomber=(Boomber) sprite;
					boomber.keyPressed(e);
				}
			}
		}

		public void keyReleased(KeyEvent e){
			for(Sprite sprite:layer.sprites){
				if(sprite instanceof Boomber){
					Boomber boomber=(Boomber) sprite;
					boomber.keyReleased(e);
				}
			}
		}
		public void keyTyped(KeyEvent e){
			layer.keyTyped(e);
		}
	}
}
