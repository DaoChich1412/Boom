package Sprites.Item;

import javax.swing.*;
import java.awt.*;

public class Heart extends  Item {
	public Heart(){
		super();
		item=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Item\\heart.png").getImage();
	}
	public Heart(int x,int y){
		super(x,y);
		item=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Item\\heart.png").getImage();
	}
	public void draw(Graphics2D g, Component s) {
		g.drawImage(item,x,y,s);
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
