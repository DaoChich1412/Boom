package Sprites.Boomber;

import javax.swing.*;

public class Main extends Boomber {
	public Main(){
		super();
		u=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\up (1).png").getImage();
		u1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\up (2).png").getImage();
		u2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\up (3).png").getImage();
		d=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\down (1).png").getImage();
		d1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\down (2).png").getImage();
		d2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\down (3).png").getImage();
		l=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\left (1).png").getImage();
		l1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\left (2).png").getImage();
		l2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\left (3).png").getImage();
		r=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\right (1).png").getImage();
		r1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\right (2).png").getImage();
		r2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\right (3).png").getImage();
	}

	public int getWidth() {
		return d.getWidth(null);
	}

	public int getHeight() {
		return d.getHeight(null);
	}

	public Main(int x,int y,int n,int number,int dame,int speed,int heart){
		super(x,y,n,number,dame,speed,heart);
		u=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\up (1).png").getImage();
		u1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\up (2).png").getImage();
		u2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\up (3).png").getImage();
		d=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\down (1).png").getImage();
		d1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\down (2).png").getImage();
		d2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\down (3).png").getImage();
		l=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\left (1).png").getImage();
		l1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\left (2).png").getImage();
		l2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\left (3).png").getImage();
		r=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\right (1).png").getImage();
		r1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\right (2).png").getImage();
		r2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Main\\right (3).png").getImage();
	}
}
