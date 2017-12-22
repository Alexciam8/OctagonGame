import java.io.File;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;




public class Music {
	public Music(){
	
	}
	public void playSound(){
		try{
			AudioInputStream audioInputStream=
				AudioSystem.getAudioInputStream(new
						File("doublebass.wav").getAbsoluteFile());
			Clip clip=AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
		}
		catch(Exception ex){
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
	public void playSound2() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("laser-01.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	public void playSound3() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sweep1.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	public void playSound4() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sweep2.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	public void playSound5() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("bomb.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
	public void playSound6() {
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("alert.wav").getAbsoluteFile());
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch(Exception ex) {
	        System.out.println("Error with playing sound.");
	        ex.printStackTrace();
	    }
	}
}




