package Play.Menu;

import Play.Diagram;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ExtraMenu extends JPanel {
	JLabel background=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\bk.jpg"));
	JLabel logo=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\logo.png"));
	JLabel resume=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (1).png"));
	JLabel mainmenu=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (2).png"));
	JLabel restart=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (3).png"));
	JLabel exit=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (4).png"));
	public ExtraMenu(int w,int h){
		setLayout(null);
		background.setBounds(0,0,w,h);
		logo.setBounds(560,80,300,100);
		resume.setBounds(560,210,300,80);
		restart.setBounds(560,320,300,80);
		mainmenu.setBounds(560,430,300,80);
		exit.setBounds(560,540,300,80);
		add(logo);add(restart);add(resume);add(mainmenu);add(exit);add(background);
		resume.addMouseListener(mouseListener);
		restart.addMouseListener(mouseListener);
		mainmenu.addMouseListener(mouseListener);
		exit.addMouseListener(mouseListener);
	}
	private MouseListener mouseListener=new MouseListener() {
		public void mouseClicked(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\bt (1).png");
				resume.setIcon(icon);
			}
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\bt (4).png");
				restart.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\bt (3).png");
				mainmenu.setIcon(icon);
			}
			if(e.getSource()==exit){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\bt (2).png");
				exit.setIcon(icon);
			}
		}

		public void mouseReleased(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (1).png");
				resume.setIcon(icon);
				//Diagram.Show("Play Game");
			}
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (2).png");
				restart.setIcon(icon);
				Diagram.Show("Map");
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (3).png");
				mainmenu.setIcon(icon);
				Diagram.Show("Menu");
			}
			if(e.getSource()==exit){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (4).png");
				exit.setIcon(icon);
				new Quit();
			}
		}

		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (1).png");
				resume.setIcon(icon);
			}
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (2).png");
				restart.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (3).png");
				mainmenu.setIcon(icon);
			}
			if(e.getSource()==exit){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\bt (4).png");
				exit.setIcon(icon);
			}
		}

		public void mouseExited(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (1).png");
				resume.setIcon(icon);
			}
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (3).png");
				restart.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (2).png");
				mainmenu.setIcon(icon);
			}
			if(e.getSource()==exit){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\bt (4).png");
				exit.setIcon(icon);
			}
		}
	};
}
