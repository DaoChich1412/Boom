package Sprites.Item;

import javax.swing.*;
import java.awt.*;

public class MultiBomb extends Item {
	public MultiBomb(){
		super();
		item=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Item\\multibomb.png").getImage();
	}
	public MultiBomb(int x,int y){
		super(x,y);
		item=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Item\\multibomb.png").getImage();
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
