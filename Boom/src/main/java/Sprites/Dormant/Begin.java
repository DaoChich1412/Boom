package Sprites.Dormant;

import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;

public class Begin extends Dormant {
	Image image=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\Begin.png").getImage();
	public Begin(){
		super();
	}
	public Begin(int x,int y,int i){
		super(x,y,i);
		speedx=0;
		speedy=0;
	}
	public void draw(Graphics2D g, Component s) {
		g.drawImage(image,x,y,s);
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

	public int getWidth() {
		return image.getWidth(null);
	}

	public int getHeight() {
		return image.getHeight(null);
	}
}
