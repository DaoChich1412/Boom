package Sprites.Bomb;

import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;

public class Die extends Sprite {
	protected int timeline;
	protected Image die1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Die\\die (1).png").getImage();
	protected Image die2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Die\\die (2).png").getImage();
	protected Image die3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Die\\die (3).png").getImage();
	protected Image die4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Die\\die (3.5).png").getImage();
	protected Image die5=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Die\\die (4).png").getImage();
	protected Image die6=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Die\\die (5).png").getImage();
	public Die(){
		super();
		timeline=120;
	}
	public Die(int x,int y){
		super(x,y);
		speedx=0;
		speedy=0;
		timeline=120;
	}
	public int getWidth() {
		return die1.getWidth(null);
	}

	public int getHeight() {
		return die1.getHeight(null);
	}
	public void setTimeline(int timeline){
		this.timeline=timeline;
	}
	public int getTimeline(){
		return timeline;
	}
	public void deadLine(){
		timeline--;
	}
	public void draw(Graphics2D g, Component s) {
		if(timeline>=100&&timeline<=120) g.drawImage(die1,x,y,s);
		else{
			if(timeline>=80) g.drawImage(die2,x,y,s);
			else{
				if(timeline>=60) g.drawImage(die3,x,y,s);
				else{
					if(timeline>=40) g.drawImage(die4,x,y,s);
					else{
						if(timeline>=20) g.drawImage(die5,x,y,s);
						else{
							if(timeline>=0){
								g.drawImage(die6,x,y,s);
							}
						}
					}
				}
			}
		}
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
