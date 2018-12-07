package Sprites;


import java.awt.*;

//Lớp tổ tiên nhân vật
abstract public class Sprite {
	//Tọa độ
	protected int x;
	protected int y;
	//Gia tốc
	protected int speedx;
	protected int speedy;
	public Sprite(){
		x=0;
		y=0;
		speedx=0;
		speedy=0;
	}
	public Sprite(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getX(){
		return x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getY(){
		return y;
	}
	public void setSpeedx(int speedx){
		this.speedx=speedx;
	}
	public int getSpeedx(){
		return speedx;
	}
	public void setSpeedy(int speedy){
		this.speedy=speedy;
	}
	public int getSpeedy(){
		return speedy;
	}

	//Các phương thức vẽ nhân vật
	abstract public void draw(Graphics2D g,Component s);
	abstract public void drawUp(Graphics2D g,Component s);
	abstract public void drawDown(Graphics2D g,Component s);
	abstract public void drawLeft(Graphics2D g,Component s);
	abstract public void drawRight(Graphics2D g,Component s);
	//Phương thức thể hiện sự chuyển động của nhân vật
	abstract public void moveTo();
	abstract public int getWidth();
	abstract public int getHeight();
}
