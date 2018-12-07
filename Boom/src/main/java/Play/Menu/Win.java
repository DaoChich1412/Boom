package Play.Menu;

import File.FileTxt;
import File.Sound;
import Play.Diagram;
import Play.Layer;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;

public class Win extends JFrame {
	JLabel info=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\w.jpg"));
	JLabel resume=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (8).png"));
	JLabel mainmenu=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (2).png"));
	Sound win;

	public Win(){
		setLayout(null);
		win=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\win.wav");
		info.setBounds(0,0,730,500);
		resume.setBounds(50,360,300,80);
		mainmenu.setBounds(380,360,300,80);
		add(resume);
		add(mainmenu);
		add(info);
		resume.addMouseListener(mouseListener);
		mainmenu.addMouseListener(mouseListener);
		Diagram.game.stop();
		win.play();

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
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (9).png");
				resume.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (4).png");
				mainmenu.setIcon(icon);
			}
		}

		public void mouseReleased(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (7).png");
				resume.setIcon(icon);
				setVisible(false);
				Layer.setLv(Layer.getLv()+1);
				win.stop();
				Diagram.game.reset();
				Diagram.game.loop();
				Diagram.Show("Play Game");
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (6).png");
				mainmenu.setIcon(icon);
				setVisible(false);
				win.stop();
				Diagram.background.reset();
				Diagram.background.loop();
				Diagram.Show("Menu");
			}
		}

		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (7).png");
				resume.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (6).png");
				mainmenu.setIcon(icon);
			}
		}

		public void mouseExited(MouseEvent e) {
			if(e.getSource()==resume){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (8).png");
				resume.setIcon(icon);
			}
			if(e.getSource()==mainmenu){
				ImageIcon icon=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Map\\bt (2).png");
				mainmenu.setIcon(icon);
			}
		}
	};
}
