package Sprites.Dormant;

import Sprites.Dormant.Dormant;

import javax.swing.*;
import java.awt.*;

public class Ground extends Dormant {
	Image g1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\1\\ground.png").getImage();
	Image g2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\2\\ground.png").getImage();
	Image g3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\3\\ground.png").getImage();
	Image g4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\4\\ground.png").getImage();
	Image[] ground=new Image[]{g1,g2,g3,g4};
	public Ground(){
		super();
	}
	public Ground(int x,int y,int i){
		super(x,y,i);
	}
	public int getWidth() {
		return g1.getWidth(null);
	}

	public int getHeight() {
		return g1.getHeight(null);
	}

	public void draw(Graphics2D g, Component s) {
		g.drawImage(ground[i],x,y,s);
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
