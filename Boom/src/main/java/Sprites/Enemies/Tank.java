package Sprites.Enemies;

import Play.Diagram;
import Sprites.Enemies.Enemy;

import javax.swing.*;
import java.awt.*;

public class Tank extends Enemy {
	Image d=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Tank\\down.png").getImage();
	Image l=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Tank\\left.png").getImage();
	Image r=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Tank\\right.png").getImage();
	Image u=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Tank\\up.png").getImage();
	protected int speed=2;
	public Tank(){
		super();
	}
	public Tank(int x, int y, int speed, int speedx){
		super(x,y,speedx,speed-Math.abs(speedx));
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public void drawUp(Graphics2D g, Component s) {
		g.drawImage(u,x,y,s);
	}

	public void drawDown(Graphics2D g, Component s) {
		g.drawImage(d,x,y,s);
	}

	public void drawLeft(Graphics2D g, Component s) {
		g.drawImage(l,x,y,s);
	}

	public void drawRight(Graphics2D g, Component s) {
		g.drawImage(r,x,y,s);
	}

	public int getWidth() {
		return d.getWidth(null);
	}

	public int getHeight() {
		return d.getHeight(null);
	}
}
