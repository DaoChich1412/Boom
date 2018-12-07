package Play.Menu;

import Play.Diagram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Option extends JPanel {
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\bk.jpg"));
	JLabel left=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\left.png"));
	JLabel right=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\right.png"));
	JLabel up=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\up.png"));
	JLabel down=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\down.png"));
	JLabel space=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\space.png"));
	JLabel back=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (1).png"));
	public Option(int w,int h){
		setLayout(null);
		background.setBounds(0,0,w,h);
		up.setBounds(1046,347,79,73);
		down.setBounds(1046,430,79,73);
		left.setBounds(957,430,79,73);
		right.setBounds(1135,430,79,73);
		space.setBounds(560,430,317,72);
		back.setBounds(1280,615,70,70);
		back.addMouseListener(mouseListener);
		JLabel lb1=new JLabel("MOVE");
		JLabel lb2=new JLabel("SET BOMB");
		Font font=new Font("Arial",Font.BOLD,30);
		lb1.setFont(font); lb1.setForeground(Color.WHITE);
		lb1.setBounds(1040,513,150,50);
		lb2.setFont(font); lb2.setForeground(Color.WHITE);
		lb2.setBounds(650,513,200,50);
		add(up);
		add(down);
		add(left);
		add(right);
		add(space);
		add(lb1);
		add(lb2);
		add(back);
		add(background);
	}
	MouseListener mouseListener=new MouseListener() {
		public void mouseClicked(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (3).png");
				back.setIcon(icon);
			}

		}

		public void mouseReleased(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (2).png");
				back.setIcon(icon);
				Diagram.Show("Menu");
			}

		}

		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (2).png");
				back.setIcon(icon);
			}

		}

		public void mouseExited(MouseEvent e) {
			if(e.getSource()==back){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\back (1).png");
				back.setIcon(icon);
			}

		}
	};
}
