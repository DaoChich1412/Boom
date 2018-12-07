package Sprites.Bomb;

import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;

public class Fire extends Sprite {
	protected Image bullet=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Tank\\bullet.png").getImage();
	public Fire(){
		super();
	}
	public Fire(int x,int y,int speedx,int speedy){
		super(x,y);
		this.speedx=speedx;
		this.speedy=speedy;
	}
	public void draw(Graphics2D g, Component s) {
		g.drawImage(bullet,x,y,s);
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
		this.x+=speedx;
		this.y+=speedy;
	}

	public int getWidth() {
		return bullet.getWidth(null);
	}

	public int getHeight() {
		return bullet.getHeight(null);
	}
}
