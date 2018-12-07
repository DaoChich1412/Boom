package File;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sound {
	protected Clip clip;
	protected AudioInputStream audio;
	protected String path;
	/*public static void main(String[] args){
		Sound sound=new Sound("C:\\Users\\Administrator\\IdeaProjects\\Boom\\src\\main\\resources\\Sound\\bombbang.wav");
		sound.play();
	}*/
	public Sound(String path){
		this.path=path;
		try{
			File sound=new File(this.path);
			audio=AudioSystem.getAudioInputStream(sound);
			clip=AudioSystem.getClip();
			clip.open(audio);
			//clip.loop(Clip.LOOP_CONTINUOUSLY);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void loop(){
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void play(){
		clip.start();
	}
	public void stop(){
		clip.stop();
		clip.close();
	}
	public void reset(){
		try{
			audio = AudioSystem.getAudioInputStream(new File(path));
			clip=AudioSystem.getClip();
			clip.open(audio);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
