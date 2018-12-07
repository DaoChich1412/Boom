package Play.Menu;



import Play.Diagram;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel{
	JLabel lbbackground1;
	JLabel lblogo;
	JLabel lbplay;
	JLabel lboption;
	JLabel lbmore;
	JLabel lbquit;
	public Menu(int w,int h){
		setLayout(null);
		lbbackground1=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\bk.jpg"));
		lbbackground1.setBounds(0,0,w,h);
		lblogo=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Different\\logo.png"));
		lblogo.setBounds(560,80,300,100);
		lbplay=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\Play button 300x80.png"));
		lbplay.setBounds(560,210,300,80);
		lboption=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\options button 300x80.png"));
		lboption.setBounds(560,320,300,80);
		lbmore=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\more button 300x80.png"));
		lbmore.setBounds(560,430,300,80);
		lbquit=new JLabel(new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\Quit button 300x80.png"));
		lbquit.setBounds(560,540,300,80);
		lbplay.addMouseListener(mouse);
		lboption.addMouseListener(mouse);
		lbmore.addMouseListener(mouse);
		lbquit.addMouseListener(mouse);

		add(lblogo);
		add(lbplay);
		add(lboption);
		add(lbmore);
		add(lbquit);
		add(lbbackground1);
	}
	private MouseListener mouse=new MouseListener() {
		public void mouseClicked(MouseEvent e) {

		}
		//Sự kiện khi nhấn chuột
		public void mousePressed(MouseEvent e) {
			if(e.getSource()==lbplay){
				ImageIcon play=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\Play orange button 300x80.png");
				lbplay.setIcon(play);
			}
			if(e.getSource()==lboption){
				ImageIcon option=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\options orange button 300x80.png");
				lboption.setIcon(option);

			}
			if(e.getSource()==lbmore){
				ImageIcon more=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\more orange button 300x80.png");
				lbmore.setIcon(more);
			}
			if(e.getSource()==lbquit){
				ImageIcon quit=new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\orange button\\Quit orange button 300x80.png");
				lbquit.setIcon(quit);
			}
		}
		//Sự kiện khi thả chuột ra
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == lbplay) {
				ImageIcon play = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\Play blue button 300x80.png");
				lbplay.setIcon(play);
				Diagram.Show("Map");
			}
			if (e.getSource() == lboption) {
				ImageIcon option = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\options blue button 300x80.png");
				lboption.setIcon(option);
				Diagram.Show("Option");
			}
			if (e.getSource() == lbmore) {
				ImageIcon more = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\more blue button 300x80.png");
				lbmore.setIcon(more);
			}
			if (e.getSource() == lbquit) {
				ImageIcon quit = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\Quit blue button 300x80.png");
				lbquit.setIcon(quit);
				new Quit();
			}
		}
		//Sự kiện khi chuột trong một vùng nào đó
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == lbplay) {
				ImageIcon play = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\Play blue button 300x80.png");
				lbplay.setIcon(play);
			}
			if (e.getSource() == lboption) {
				ImageIcon option = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\options blue button 300x80.png");
				lboption.setIcon(option);
			}
			if (e.getSource() == lbmore) {
				ImageIcon more = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\more blue button 300x80.png");
				lbmore.setIcon(more);
			}
			if (e.getSource() == lbquit) {
				ImageIcon quit = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\Blue buttons\\Quit blue button 300x80.png");
				lbquit.setIcon(quit);
			}
		}
		//Sự kiện khi chuột thoát ra khỏi vùng nào đó
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == lbplay) {
				ImageIcon play = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\Play button 300x80.png");
				lbplay.setIcon(play);
			}
			if (e.getSource() == lboption) {
				ImageIcon option = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\options button 300x80.png");
				lboption.setIcon(option);
			}
			if (e.getSource() == lbmore) {
				ImageIcon more = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\more button 300x80.png");
				lbmore.setIcon(more);
			}
			if (e.getSource() == lbquit) {
				ImageIcon quit = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Button\\button\\Quit button 300x80.png");
				lbquit.setIcon(quit);
			}
		}
	};
}
