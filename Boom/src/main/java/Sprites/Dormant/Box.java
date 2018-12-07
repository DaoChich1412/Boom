package Sprites.Dormant;

import javax.swing.*;
import java.awt.*;

public class Box extends Dormant {
	Image b1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\1\\box.png").getImage();
	Image b2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\2\\box.png").getImage();
	Image b3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\3\\box.png").getImage();
	Image b4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\4\\box.png").getImage();
	Image[] box=new Image[]{b1,b2,b3,b4};
	public Box(){
		super();
	}
	public Box(int x,int y,int i){
		super(x,y,i);
	}
	public int getWidth() {
		return b1.getWidth(null);
	}

	public int getHeight() {
		return b1.getHeight(null);
	}

	public void draw(Graphics2D g, Component s) {
		g.drawImage(box[i],x,y,s);
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
