package Sprites.Item;

import Sprites.Sprite;

import java.awt.*;

abstract public class Item extends Sprite {
	Image item;
	public Item(){
		super();
	}
	public Item(int x, int y) {
		super(x,y);
		speedx=0;
		speedy=0;
	}
	public int getWidth() {
		return item.getWidth(null);
	}

	public int getHeight() {
		return item.getHeight(null);
	}
}
