package Sprites.Bomb;


import Sprites.Boomber.Boomber;
import Sprites.Sprite;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;


public class Bomb extends Sprite{
	public int timeline;//Thời gian bom nổ
	protected int dame;//Sức mạnh của bom
	public static int up;
	public static int down;
	public static int left;
	public static int right;
	public static boolean can=true;
	protected Image b0=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\000.png").getImage();
	protected Image b1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\001.png").getImage();
	protected Image b2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\002.png").getImage();
	protected Image b3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\003.png").getImage();
	protected Image b4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\004.png").getImage();
	protected Image fc=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flamecenter.png").getImage();
	protected Image fd=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flamedown.png").getImage();
	protected Image fh=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flameheight.png").getImage();
	protected Image fl=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flameleft.png").getImage();
	protected Image fr=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flameright.png").getImage();
	protected Image fu=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flameup.png").getImage();
	protected Image fw=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Boom\\flamewidth.png").getImage();
	public Bomb(){
		super();
		timeline=160;
		dame=1;
		up=dame;
		down=dame;
		left=dame;
		right=dame;
		can=true;
	}
	public Bomb(int x,int y,int dame){
		super(x,y);
		speedx=0;
		speedy=0;
		timeline=160;
		this.dame=dame;
		up=dame;
		down=dame;
		left=dame;
		right=dame;
		can=true;
	}
	public int getWidth() {
		return b0.getWidth(null);
	}

	public int getHeight() {
		return b0.getHeight(null);
	}
	public void setTimeline(int timeline){
		this.timeline=timeline;
	}
	public int getTime(){
		return timeline;
	}
	public void deadLine(){
		timeline--;
	}
	public void setDame(Boomber boomber) {
		this.dame=boomber.getDame();
	}
	public int getDame(){
		return dame;
	}
	public void draw(Graphics2D g, Component s){
		if(timeline>=120&&timeline<=160) g.drawImage(b0,x,y,s);
		else{
			if(timeline>=90) g.drawImage(b1,x,y,s);
			else{
				if(timeline>=70) g.drawImage(b2,x,y,s);
				else{
					if(timeline>=40) g.drawImage(b3,x,y,s);
					else{
						if(timeline>=10) g.drawImage(b4,x,y,s);
						else{
							if(timeline>=0) {
								g.drawImage(fc, x, y, s);
								drawUp(g,s);
								drawDown(g,s);
								drawLeft(g,s);
								drawRight(g,s);
							}
						}
					}
				}
			}
		}
	}
	public void drawUp(Graphics2D g, Component s) {
		for(int i=1;i<up;i++){
			g.drawImage(fh,x,y-45*i,s);
		}
		g.drawImage(fu,x,y-45*up,s);
	}

	public void drawDown(Graphics2D g, Component s) {
		for(int i=1;i<down;i++){
			g.drawImage(fh,x,y+45*i,s);
		}
		g.drawImage(fd,x,y+45*down,s);
	}

	public void drawLeft(Graphics2D g, Component s) {
		for(int i=1;i<left;i++){
			g.drawImage(fw,x-45*i,y,s);
		}
		g.drawImage(fl,x-45*left,y,s);
	}

	public void drawRight(Graphics2D g, Component s) {
		for(int i=1;i<right;i++){
			g.drawImage(fw,x+45*i,y,s);
		}
		g.drawImage(fr,x+45*right,y,s);
	}

	public void moveTo() {

	}
}
