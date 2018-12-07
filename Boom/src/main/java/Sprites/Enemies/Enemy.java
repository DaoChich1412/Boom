package Sprites.Enemies;

import Play.Diagram;
import Sprites.Sprite;

import java.awt.*;
//Lớp nhân vật phản diện
abstract public class Enemy extends Sprite {
	//Các thuộc tính để tạo animation khá đơn giản
	public static int delay=10;
	public static int j=delay;
	public static int i=0;
	public static int di=1;
	public Enemy(){
		super();
	}
	public Enemy(int x,int y,int speed,int speedx){
		super(x,y);
		this.speedx=speedx;
		this.speedy=speed-Math.abs(speedx);
	}
	//Hoạt hình
	public static void doAnimation(){
		j--;
		if(j<=0){
			j=delay;
			i+=di;
			if(i==3||i==0){
				di=-di;
			}
		}
	}
	public void draw(Graphics2D g,Component s){
		if(getSpeedx()>0&&getSpeedy()==0){
			drawRight(g,s);
		}
		if(getSpeedx()<0&&getSpeedy()==0){
			drawLeft(g,s);
		}
		if(getSpeedx()==0&&getSpeedy()>0){
			drawDown(g,s);
		}
		if(getSpeedx()==0&&getSpeedy()<0){
			drawUp(g,s);
		}
	}
	public void moveTo() {
		x=x+speedx;
		y=y+speedy;
	}
	abstract public void setSpeed(int speed);
	abstract public int getSpeed();
}
