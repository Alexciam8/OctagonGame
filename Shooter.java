import javax.swing.*;


import java.awt.*;


public class Shooter {


	private int Locx;
	
	private int Locy;
	private int Dx;
	private int Dy;
	private int dd=25;
	private Color e;
	private int width;
	private int height;
	
	public Shooter(int w, int h, int x, int y){
	 
		 width=w;
		 height=h;
		 Locx=x;
		 Locy=y;
	}
	public void setLocx(int x){
		Locx=x;
	}
	public void setLocy(int y){
		Locy=y;
	}
	public int getx(){
		return Locx;
	}
	public int gety(){
		return Locy;
	}
	
	
	
	
	public void drawBall(Graphics g, int d, Color e){
		g.setColor(e);
		g.fillOval(Locx,Locy,d,d);
	}
}






//Alex did this class




