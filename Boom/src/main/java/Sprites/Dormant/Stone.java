package Sprites.Dormant;

import javax.swing.*;
import java.awt.*;

public class Stone extends Dormant {
	Image s1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\1\\stone.png").getImage();
	Image s2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\2\\stone.png").getImage();
	Image s3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\3\\stone.png").getImage();
	Image s4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\4\\stone.png").getImage();
	Image[] stone=new Image[]{s1,s2,s3,s4};
	public Stone(){
		super();
	}
	public Stone(int x,int y,int i){
		super(x,y,i);
	}
	public int getWidth() {
		return s1.getWidth(null);
	}

	public int getHeight() {
		return s1.getHeight(null);
	}
	public void draw(Graphics2D g, Component s) {
		g.drawImage(stone[i],x,y,s);
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
