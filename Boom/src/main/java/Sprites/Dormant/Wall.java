package Sprites.Dormant;


import javax.swing.*;
import java.awt.*;

public class Wall extends Dormant {
	Image w1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\1\\wall.png").getImage();
	Image w2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\2\\wall.png").getImage();
	Image w3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\3\\wall.png").getImage();
	Image w4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\4\\wall.png").getImage();
	Image[] wall=new Image[]{w1,w2,w3,w4};
	public Wall(){
		super();
	}
	public Wall(int x, int y,int i){
		super(x,y,i);
	}
	public int getWidth() {
		return w1.getWidth(null);
	}

	public int getHeight() {
		return w1.getHeight(null);
	}

	public void draw(Graphics2D g, Component s) {
		g.drawImage(wall[i],x,y,s);
	}

	public void drawUp(Graphics2D g, Component s) {

	}

	public void drawDown(Graphics2D g, Component s) {

	}

	public void drawLeft(Graphics2D g, Component s) {

	}

	public void drawRight(Graphics2D g, Component s) {

	}

	public void moveTo() {

	}
}
