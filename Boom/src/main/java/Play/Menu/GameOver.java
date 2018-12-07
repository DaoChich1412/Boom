package Play.Menu;

import File.Sound;
import Play.Diagram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameOver extends JFrame {
	JLabel info=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\o.jpg"));
	JLabel restart=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (1).png"));
	JLabel mainmenu=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (2).png"));
	Sound gameover;
	public GameOver(){
		setLayout(null);
		gameover=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\gameover.wav");
		info.setBounds(0,0,730,500);
		restart.setBounds(50,360,300,80);
		mainmenu.setBounds(380,360,300,80);
		add(restart);
		add(mainmenu);
		add(info);
		restart.addMouseListener(mouseListener);
		mainmenu.addMouseListener(mouseListener);
		Diagram.game.stop();
		gameover.play();

		setSize(730,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(this);
		setResizable(false);
		setVisible(true);
	}
	MouseListener mouseListener=new MouseListener() {
		public void mouseClicked(MouseEvent e) {

		}

		public void mousePressed(MouseEvent e) {
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (3).png");
				restart.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (4).png");
				mainmenu.setIcon(icon);
			}
		}

		public void mouseReleased(MouseEvent e) {
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (5).png");
				restart.setIcon(icon);
				setVisible(false);
				gameover.stop();
				Diagram.background.reset();
				Diagram.background.loop();
				Diagram.Show("Map");
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (6).png");
				mainmenu.setIcon(icon);
				setVisible(false);
				gameover.stop();
				Diagram.background.reset();
				Diagram.background.loop();
				Diagram.Show("Menu");
			}
		}

		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (5).png");
				restart.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (6).png");
				mainmenu.setIcon(icon);
			}
		}

		public void mouseExited(MouseEvent e) {
			if(e.getSource()==restart){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (1).png");
				restart.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (2).png");
				mainmenu.setIcon(icon);
			}
		}
	};
}
