package Sprites.Boomber;

import Sprites.Sprite;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

abstract public class Boomber extends Sprite implements KeyListener {
	protected int number;//Số bomb được đặt
	protected int dame;//Sức tấn công được tăng thêm
	protected int speed;//Tốc độ
	protected int heart;
	protected Image u;
	protected Image u1;
	protected Image u2;
	protected Image d;
	protected Image d1;
	protected Image d2;
	protected Image l;
	protected Image l1;
	protected Image l2;
	protected Image r;
	protected Image r1;
	protected Image r2;
	public static int n;//Thuộc tính phụ để xác định phương thức vẽ
	protected static int delay=5;
	protected static int j=delay;
	protected int k;//Thuộc tính phụ để xác định ảnh vẽ ra
	protected int dk=1;//Số gia
	public Boomber(){
		super();
		n=1;
		k=0;
		number=1;
		dame=1;
		speed=2;
		heart=3;
	}
	public Boomber(int x,int y,int n,int number,int dame,int speed,int heart){
		super(x,y);
		speedx=0;
		speedy=0;
		this.n=n;
		k=0;
		this.number=number;
		this.dame=dame;
		this.speed=speed;
		this.heart=heart;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return number;
	}
	public void setDame(int dame){
		this.dame=dame;
	}
	public int getDame(){
		return dame;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public int getSpeed(){
		return speed;
	}
	public void setHeart(int heart){
		this.heart=heart;
	}
	public int getHeart(){
		return heart;
	}
	public void draw(Graphics2D g,Component s){
		if(n==1){
			drawUp(g,s);
		}
		if(n==2){
			drawDown(g,s);
		}
		if(n==3){
			drawLeft(g,s);
		}
		if(n==4){
			drawRight(g,s);
		}
	}

	public void drawUp(Graphics2D g, Component s) {
		switch (k){
			case 1:{
				g.drawImage(u1,x,y,s);
				break;
			}
			case 2:{
				g.drawImage(u2,x,y,s);
				break;
			}
			default:{
				g.drawImage(u,x,y,s);
			}
		}
	}
	public void drawDown(Graphics2D g,Component s) {
		switch (k){
			case 1:{
				g.drawImage(d1,x,y,s);
				break;
			}
			case 2:{
				g.drawImage(d2,x,y,s);
				break;
			}
			default:{
				g.drawImage(d,x,y,s);
			}
		}
	}
	public void drawLeft(Graphics2D g,Component s) {
		switch (k){
			case 1:{
				g.drawImage(l1,x,y,s);
				break;
			}
			case 2:{
				g.drawImage(l2,x,y,s);
				break;
			}
			default:{
				g.drawImage(l,x,y,s);
			}
		}
	}
	public void drawRight(Graphics2D g,Component s) {
		switch (k){
			case 1:{
				g.drawImage(r1,x,y,s);
				break;
			}
			case 2:{
				g.drawImage(r2,x,y,s);
				break;
			}
			default:{
				g.drawImage(r,x,y,s);
			}
		}
	}
	public void moveTo() {
			x=x+speedx;
			y=y+speedy;
	}
	public void keyTyped(KeyEvent e) {
	}
	//1 là UP, 2 là DOWN, 3 là LEFT, 4 là RIGHT
	public void keyPressed(KeyEvent e) {
		j--;//Tạo độ trễ
		if(j<=0){
			j=delay;
			k=k+dk;//Thay đổi giá trị của k mỗi lần nhấn
			if(k==3||k==0) dk=-dk;
		}
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_UP){
			n=1;
			setSpeedx(0);
			setSpeedy(-speed);
		}
		if(key==KeyEvent.VK_DOWN){
			n=2;
			setSpeedx(0);
			setSpeedy(speed);
		}
		if(key==KeyEvent.VK_LEFT){
			n=3;
			setSpeedx(-speed);
			setSpeedy(0);
		}
		if(key==KeyEvent.VK_RIGHT){
			n=4;
			setSpeedx(speed);
			setSpeedy(0);
		}
	}

	public void keyReleased(KeyEvent e) {
		//n vẫn để như thế
		k=0;
		dk=1;
		setSpeedx(0);
		setSpeedy(0);
	}
}

