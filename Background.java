import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Background{
	
	private int bgcolor;
	private int circleish=600;
	private int circleish2=600;
	private Color red=Color.RED;
	private Color yel=Color.yellow;
	private Color cyan=Color.cyan;
	private Color pink=Color.PINK;
	private Color orange=Color.orange;
	private Color white=Color.white;
	private Color color;
	Background(){
		
	}
	
	public void drawBackground(Graphics g,int bg, int circle,int circle2,int x,int y,int x2,int y2){
		bgcolor=bg;
		circleish=circle;
		circleish2=circle2;
		if(bgcolor==5){
			bgcolor=0;
		}
		if(bgcolor==0){
			color=red;
		}
		else if(bgcolor==1){
			color=yel;
		}
		else if(bgcolor==2){
			color=cyan;
		}
		else if(bgcolor==3){
			color=pink;
		}
		else if(bgcolor==4){
			color=orange;
		}
		else if(bgcolor==5){
			color=white;
		}
		g.setColor(color);
		g.fillRect(0,0,600,600);
		if(bgcolor%2==0){
			g.setColor(white);
		}
		else{
			g.setColor(Color.BLACK);
		}
		g.fillOval(x,y,circleish,circleish);
		if(bgcolor%2==0){
			g.setColor(Color.GREEN);
		}
		else{
			g.setColor(Color.ORANGE);
		}
		g.fillOval(x2,y2,circleish2,circleish2);
	}
}


//Josh did this class






