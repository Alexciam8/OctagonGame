import javax.swing.*;


import java.awt.*;


public class PowerUp {
	private int octx[]= new int[8];
   private  int octy[]= new int[8];
	private int Locx=-50;
	private int oct;


	private int Locy=-50;
	private int Dx;
	private int Dy;
	private int dd=10;
	private Color e;
	private int width;
	private int height;
	private int count=0;
	public PowerUp(int w, int h, int x, int y, int oo){
	
		octx[0]=(-5)+x;
	   	octx[1]=(5)+x;
	   	octx[2]=(-5)+x;
	   	octx[3]=15+x;
	  	octx[4]=5+x;
	  	octx[5]=-5+x;
	  	octx[6]=-15+x;
		octx[7]=-15+x;
	   		
		octy[0]=-15+y;
		octy[1]=-15+y;
		octy[2]=-5+y;
		octy[3]=5+y;	
		octy[4]=15+y;
		octy[5]=15+y;
		octy[6]=5+y;
	   	octy[7]=-5+y;
		width=w;
		height=h;
		Locx=x;
		Locy=y;
	 oct=oo;
	}
	public void setLocx(int x){
		Locx=x;
	}
	public void setLocy(int y){
		Locy=y;
	}
	public int[] getx(){
		return octx;
	}
	public int[] gety(){
		return octy;
	}
	
	public boolean hasLaunched(){
		if (Locx<620 &&Locx>-20 &&Locy<620 &&Locy>-20){
			return true;
		}
		
		return false;
	}
	public void setOct(int o){
		oct=o;
	}
	public int getOct(){
		return oct;
	}
	
	public void move(){
		int x=0;
		int y=0;
		if (oct==0){
			x=50;
			y=600;
		 
	  		octy[0]=octy[0]-8;
	  		octy[1]=octy[1]-8;
	  		octy[2]=octy[2]-8;
	  		octy[3]=octy[3]-8;
	  		octy[4]=octy[4]-8;
	  		octy[5]=octy[5]-8;
	  		octy[6]=octy[6]-8;
	  		octy[7]=octy[7]-8;
			
		}
		if (oct==1){
			x=50;
			octy[0]=octy[0]+8;
	  		octy[1]=octy[1]+8;
	  		octy[2]=octy[2]+8;
	  		octy[3]=octy[3]+8;
	  		octy[4]=octy[4]+8;
	  		octy[5]=octy[5]+8;
	  		octy[6]=octy[6]+8;
	  		octy[7]=octy[7]+8;		}
		if (oct==2){


			x=550;
			octy[0]=octy[0]+8;
	  		octy[1]=octy[1]+8;
	  		octy[2]=octy[2]+8;
	  		octy[3]=octy[3]+8;
	  		octy[4]=octy[4]+8;
	  		octy[5]=octy[5]+8;
	  		octy[6]=octy[6]+8;
	  		octy[7]=octy[7]+8;
			}
		if (oct==3){
			x=50;
			y=550;
		 
			octy[0]=octy[0]-8;
	  		octy[1]=octy[1]-8;
	  		octy[2]=octy[2]-8;
	  		octy[3]=octy[3]-8;
	  		octy[4]=octy[4]-8;
	  		octy[5]=octy[5]-8;
	  		octy[6]=octy[6]-8;
	  		octy[7]=octy[7]-8;
			}
		if (oct==4){
			x=600;
			y=50;
	  		octx[0]=octx[0]-8;
	  		octx[1]=octx[1]-8;
	  		octx[2]=octx[2]-8;
	  		octx[3]=octx[3]-8;
	  		octx[4]=octx[4]-8;
	  		octx[5]=octx[5]-8;
	  		octx[6]=octx[6]-8;
	  		octx[7]=octx[7]-8;
			}
		if (oct==5){
			x=600;
			y=550;
			octx[0]=octx[0]-8;
	  		octx[1]=octx[1]-8;
	  		octx[2]=octx[2]-8;
	  		octx[3]=octx[3]-8;
	  		octx[4]=octx[4]-8;
	  		octx[5]=octx[5]-8;
	  		octx[6]=octx[6]-8;
	  		octx[7]=octx[7]-8;
			}
		if (oct==6){
			x=0;
			y=550;
			octx[0]=octx[0]+8;
	  		octx[1]=octx[1]+8;
	  		octx[2]=octx[2]+8;
	  		octx[3]=octx[3]+8;
	  		octx[4]=octx[4]+8;
	  		octx[5]=octx[5]+8;
	  		octx[6]=octx[6]+8;
	  		octx[7]=octx[7]+8;		}
		if (oct==7){
			x=0;
			y=50;
			octx[0]=octx[0]+8;
	  		octx[1]=octx[1]+8;
	  		octx[2]=octx[2]+8;
	  		octx[3]=octx[3]+8;
	  		octx[4]=octx[4]+8;
	  		octx[5]=octx[5]+8;
	  		octx[6]=octx[6]+8;
	  		octx[7]=octx[7]+8;	
	  		
			}
		count++;
		if (count<2){
		octx[0]=(-5)+x;
	   	octx[1]=(5)+x;
	   	octx[2]=(-5)+x;
	   	octx[3]=15+x;
	  	octx[4]=5+x;
	  	octx[5]=-5+x;
	  	octx[6]=-15+x;
		octx[7]=-15+x;
	   		
		octy[0]=-15+y;
		octy[1]=-15+y;
		octy[2]=-5+y;
		octy[3]=5+y;	
		octy[4]=15+y;
		octy[5]=15+y;
		octy[6]=5+y;
	   	octy[7]=-5+y;
		}
	}
	
	public int getDD(){
		return octx.length;
	}
	
	public void drawBall(Graphics g, int d, Color e){
		dd=d;
		g.setColor(e);
		g.fillPolygon(octx, octy, octx.length);
		g.setColor(Color.BLACK);
		g.drawPolygon(octx, octy, octx.length);
	}
}






//Alex did this class. Again pretty much the same as the enemy class




