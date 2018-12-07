package Sprites.Dormant;

import Sprites.Sprite;


//Lớp nhân vật bất động
abstract public class Dormant extends Sprite {

	protected int i;//Quyết định hình vẽ
	public Dormant(){
		super();
		i=0;
	}
	public Dormant(int x,int y,int i){
		super(x,y);
		speedx=0;
		speedy=0;
		this.i=i;
	}
}
