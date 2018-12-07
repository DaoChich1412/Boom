package Play.Menu;

import File.FileTxt;
import Play.Diagram;
import Play.Layer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class Map extends JPanel {
	JLabel background1=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\bk.jpg"));
	JLabel back=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (1).png"));
	JLabel n1=new JLabel();
	JLabel n2=new JLabel();
	JLabel n3=new JLabel();
	JLabel n4=new JLabel();
	JLabel n5=new JLabel();
	JLabel n6=new JLabel();
	JLabel n7=new JLabel();
	JLabel n8=new JLabel();
	JLabel n9=new JLabel();
	JLabel[] n=new JLabel[]{n1,n2,n3,n4,n5,n6,n7,n8,n9};
	//True
	ImageIcon i1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_1.png");
	ImageIcon i2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_2.png");
	ImageIcon i3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_3.png");
	ImageIcon i4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_4.png");
	ImageIcon i5=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_5.png");
	ImageIcon i6=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_6.png");
	ImageIcon i7=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_7.png");
	ImageIcon i8=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_8.png");
	ImageIcon i9=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_9.png");
	ImageIcon[] i=new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9};
	//False
	ImageIcon z1=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_1.png");
	ImageIcon z2=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_2.png");
	ImageIcon z3=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_3.png");
	ImageIcon z4=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_4.png");
	ImageIcon z5=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_5.png");
	ImageIcon z6=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_6.png");
	ImageIcon z7=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_7.png");
	ImageIcon z8=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_8.png");
	ImageIcon z9=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_1_128x128_9.png");
	ImageIcon[] z=new ImageIcon[]{z1,z2,z3,z4,z5,z6,z7,z8,z9};

	public Map(int w,int h){
		setLayout(null);
		JLabel logo=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\1.png"));
		logo.setBounds(750,50,256,70);
		add(logo);

		//FileTxt.WriteFile("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\java\\File\\Level.txt","t\nf\nf\nf\nf\nf\nf\nf\nf\n");
		ArrayList<String> list=new ArrayList<String>();
		FileTxt.ReadFile("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\java\\File\\Level.txt",list);
		for(int j=0;j<list.size();j++){
			if(list.get(j).equals("t")){
				n[j].setIcon(i[j]);
				n[j].addMouseListener(mouseListener);
			}
			else{
				if(list.get(j).equals("f")){
					n[j].setIcon(z[j]);
				}
			}
		}

		n1.setBounds(650,160,128,128);
		n2.setBounds(808,160,128,128);
		n3.setBounds(966,160,128,128);
		n4.setBounds(650,318,128,128);
		n5.setBounds(808,318,128,128);
		n6.setBounds(966,318,128,128);
		n7.setBounds(650,476,128,128);
		n8.setBounds(808,476,128,128);
		n9.setBounds(966,476,128,128);
		add(n1);add(n2);add(n3);add(n4);add(n5);add(n6);add(n7);add(n8);add(n9);

		back.setBounds(1280,615,70,70);
		add(back);
		back.addMouseListener(mouseListener);

		background1.setBounds(0,0,w,h);
		add(background1);
	}
	MouseListener mouseListener=new MouseListener() {
		public void mouseClicked(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {
			if (e.getSource() == back) {
				ImageIcon icon = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (3).png");
				back.setIcon(icon);
			}
			if(e.getSource()==n1){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_1.png");
				n1.setIcon(icon);
			}
			if(e.getSource()==n2){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_2.png");
				n2.setIcon(icon);
			}
			if(e.getSource()==n3){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_3.png");
				n3.setIcon(icon);
			}
			if(e.getSource()==n4){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_4.png");
				n4.setIcon(icon);
			}
			if(e.getSource()==n5){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_5.png");
				n5.setIcon(icon);
			}
			if(e.getSource()==n6){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_6.png");
				n6.setIcon(icon);
			}
			if(e.getSource()==n7){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_7.png");
				n7.setIcon(icon);
			}
			if(e.getSource()==n8){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_8.png");
				n8.setIcon(icon);
			}
			if(e.getSource()==n9){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_2_128x128_9.png");
				n9.setIcon(icon);
			}
		}
		public void mouseReleased(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (2).png");
				back.setIcon(icon);
				Diagram.Show("Menu");
			}
			if(e.getSource()==n1){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_1.png");
				n1.setIcon(icon);
				Layer.setLv(1);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n2){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_2.png");
				n2.setIcon(icon);
				Layer.setLv(2);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n3){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_3.png");
				n3.setIcon(icon);
				Layer.setLv(3);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n4){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_4.png");
				n4.setIcon(icon);
				Layer.setLv(4);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n5){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_5.png");
				n5.setIcon(icon);
				Layer.setLv(5);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n6){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_6.png");
				n6.setIcon(icon);
				Layer.setLv(6);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n7){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_7.png");
				n7.setIcon(icon);
				Layer.setLv(7);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n8){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_8.png");
				n8.setIcon(icon);
				Layer.setLv(8);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==n9){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_9.png");
				n9.setIcon(icon);
				Layer.setLv(9);
				Diagram.background.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
		}

		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (2).png");
				back.setIcon(icon);
			}
			if(e.getSource()==n1){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_1.png");
				n1.setIcon(icon);
			}
			if(e.getSource()==n2){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_2.png");
				n2.setIcon(icon);
			}
			if(e.getSource()==n3){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_3.png");
				n3.setIcon(icon);
			}
			if(e.getSource()==n4){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_4.png");
				n4.setIcon(icon);
			}
			if(e.getSource()==n5){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_5.png");
				n5.setIcon(icon);
			}
			if(e.getSource()==n6){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_6.png");
				n6.setIcon(icon);
			}
			if(e.getSource()==n7){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_7.png");
				n7.setIcon(icon);
			}
			if(e.getSource()==n8){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_8.png");
				n8.setIcon(icon);
			}
			if(e.getSource()==n9){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_4_128x128_9.png");
				n9.setIcon(icon);
			}
		}

		public void mouseExited(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (1).png");
				back.setIcon(icon);
			}
			if(e.getSource()==n1){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_1.png");
				n1.setIcon(icon);
			}
			if(e.getSource()==n2){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_2.png");
				n2.setIcon(icon);
			}
			if(e.getSource()==n3){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_3.png");
				n3.setIcon(icon);
			}
			if(e.getSource()==n4){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_4.png");
				n4.setIcon(icon);
			}
			if(e.getSource()==n5){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_5.png");
				n5.setIcon(icon);
			}
			if(e.getSource()==n6){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_6.png");
				n6.setIcon(icon);
			}
			if(e.getSource()==n7){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_7.png");
				n7.setIcon(icon);
			}
			if(e.getSource()==n8){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_8.png");
				n8.setIcon(icon);
			}
			if(e.getSource()==n9){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Number_Blocks_01\\Number_Blocks_01_Set_3_128x128_9.png");
				n9.setIcon(icon);
			}
		}
	};
}
