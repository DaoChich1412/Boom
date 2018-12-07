package Sprites.Enemies;

import javax.swing.*;
import java.awt.*;

public class Bum extends Enemy {
	Image d=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bum\\down.png").getImage();
	Image l=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bum\\left.png").getImage();
	Image r=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bum\\right.png").getImage();
	Image u=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bum\\up.png").getImage();
	protected int speed=1;
	public Bum(){
		super();
	}
	public Bum(int x,int y,int speed,int speedx){
		super(x,y,speed,speedx);
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
