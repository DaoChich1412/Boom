package Play.Menu;

import Play.Diagram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Quit extends JFrame {
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\bk.jpg"));
	JLabel question=new JLabel("Do you want to exit???");
	JLabel yes=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\yes (1).png"));
	JLabel no=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\no (1).png"));
	public Quit(){
		setLayout(null);
		setSize(370,150);
		question.setBounds(10,10,340,50);
		Font font=new Font("Arial",Font.BOLD,30);
		Color color=new Color(25, 248, 255);
		question.setForeground(color);
		question.setFont(font);
		yes.setBounds(110,60,50,50);
		no.setBounds(190,60,50,50);
		yes.addMouseListener(mouseListener);
		no.addMouseListener(mouseListener);
		background.setBounds(0,0,370,150);
		add(question);
		add(yes);
		add(no);
		add(background);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	MouseListener mouseListener=new MouseListener() {
		public void mouseClicked(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource()==yes){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\yes (3).png");
				yes.setIcon(icon);
			}
			if(e.getSource()==no){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\no (3).png");
				no.setIcon(icon);
			}
		}

		public void mouseReleased(MouseEvent e) {
			if(e.getSource()==yes){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\yes (2).png");
				yes.setIcon(icon);
				Diagram.game.stop();
				Diagram.background.stop();
				System.exit(0);
			}
			if(e.getSource()==no){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\no (2).png");
				no.setIcon(icon);
				setVisible(false);
			}
		}

		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==yes){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\yes (2).png");
				yes.setIcon(icon);
			}
			if(e.getSource()==no){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\no (2).png");
				no.setIcon(icon);
			}
		}

		public void mouseExited(MouseEvent e) {
			if(e.getSource()==yes){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\yes (1).png");
				yes.setIcon(icon);
			}
			if(e.getSource()==no){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\option\\no (1).png");
				no.setIcon(icon);
			}
		}
	};
}
