package Sprites.Enemies;

import javax.swing.*;
import java.awt.*;

public class Bat extends Enemy {
	Image d=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\down (1).png").getImage();
	Image d1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\down (2).png").getImage();
	Image d2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\down (3).png").getImage();
	Image l=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\left (1).png").getImage();
	Image l1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\left (2).png").getImage();
	Image l2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\left (3).png").getImage();
	Image r=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\right (1).png").getImage();
	Image r1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\right (2).png").getImage();
	Image r2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\right (3).png").getImage();
	Image u=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\up (1).png").getImage();
	Image u1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\up (2).png").getImage();
	Image u2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Bat\\up (3).png").getImage();
	protected int speed=1;
	public Bat(){
		super();
	}
	public Bat(int x,int y,int speed,int speedx){
		super(x,y,speed,speedx);
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public void drawUp(Graphics2D g, Component s) {
		switch (i){
			case 1:{
				g.drawImage(u1,x,y,s);
				break;
			}
			case 3:{
				g.drawImage(u2,x,y,s);
				break;
			}
			default:{
				g.drawImage(u,x,y,s);
			}
		}
	}

	public void drawDown(Graphics2D g, Component s) {
		switch (i){
			case 1:{
				g.drawImage(d1,x,y,s);
				break;
			}
			case 3:{
				g.drawImage(d2,x,y,s);
				break;
			}
			default:{
				g.drawImage(d,x,y,s);
			}
		}
	}

	public void drawLeft(Graphics2D g, Component s) {
		switch (i){
			case 1:{
				g.drawImage(l1,x,y,s);
				break;
			}
			case 3:{
				g.drawImage(l2,x,y,s);
				break;
			}
			default:{
				g.drawImage(l,x,y,s);
			}
		}
	}

	public void drawRight(Graphics2D g, Component s) {
		switch (i){
			case 1:{
				g.drawImage(r1,x,y,s);
				break;
			}
			case 3:{
				g.drawImage(r2,x,y,s);
				break;
			}
			default:{
				g.drawImage(r,x,y,s);
			}
		}
	}
	public int getWidth() {
		return d.getWidth(null);
	}

	public int getHeight() {
		return d.getHeight(null);
	}
}

