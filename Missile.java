import javax.swing.*;

import java.awt.*;

public class Missile {
	private int octx[]= new int[8];
   private  int octy[]= new int[8];
	private int Locx=-50;
	private int oct;
	Polygon p1= new Polygon(octx,octy, octx.length);
	private int Locy=-50;
	private int Dx;
	private int Dy;
	private int dd=10;
	private Color e;
	private int width;
	private int height;
	
	public Missile(int w, int h, int x, int y, int oo){
	
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
		if (oct==0){
		
		 
	  		octy[0]=octy[0]-8;
	  		octy[1]=octy[1]-8;
	  		octy[2]=octy[2]-8;
	  		octy[3]=octy[3]-8;
	  		octy[4]=octy[4]-8;
	  		octy[5]=octy[5]-8;
	  		octy[6]=octy[6]-8;
	  		octy[7]=octy[7]-8;
			;
		}
		if (oct==1){

			octx[0]=octx[0]+8;
	  		octx[1]=octx[1]+8;
	  		octx[2]=octx[2]+8;
	  		octx[3]=octx[3]+8;
	  		octx[4]=octx[4]+8;
	  		octx[5]=octx[5]+8;
	  		octx[6]=octx[6]+8;
	  		octx[7]=octx[7]+8;
	  		octy[0]=octy[0]-8;
	  		octy[1]=octy[1]-8;
	  		octy[2]=octy[2]-8;
	  		octy[3]=octy[3]-8;
	  		octy[4]=octy[4]-8;
	  		octy[5]=octy[5]-8;
	  		octy[6]=octy[6]-8;
	  		octy[7]=octy[7]-8;		}
		if (oct==2){

			octx[0]=octx[0]+8;
	  		octx[1]=octx[1]+8;
	  		octx[2]=octx[2]+8;
	  		octx[3]=octx[3]+8;
	  		octx[4]=octx[4]+8;
	  		octx[5]=octx[5]+8;
	  		octx[6]=octx[6]+8;
	  		octx[7]=octx[7]+8;
			}
		if (oct==3){

			octy[0]=octy[0]+8;
	  		octy[1]=octy[1]+8;
	  		octy[2]=octy[2]+8;
	  		octy[3]=octy[3]+8;
	  		octy[4]=octy[4]+8;
	  		octy[5]=octy[5]+8;
	  		octy[6]=octy[6]+8;
	  		octy[7]=octy[7]+8;
	  		
			octx[0]=octx[0]+8;
	  		octx[1]=octx[1]+8;
	  		octx[2]=octx[2]+8;
	  		octx[3]=octx[3]+8;
	  		octx[4]=octx[4]+8;
	  		octx[5]=octx[5]+8;
	  		octx[6]=octx[6]+8;
	  		octx[7]=octx[7]+8;
			}
		if (oct==4){
			
			octy[0]=octy[0]+8;
	  		octy[1]=octy[1]+8;
	  		octy[2]=octy[2]+8;
	  		octy[3]=octy[3]+8;
	  		octy[4]=octy[4]+8;
	  		octy[5]=octy[5]+8;
	  		octy[6]=octy[6]+8;
	  		octy[7]=octy[7]+8;
			}
		if (oct==5){
			octy[0]=octy[0]+8;
	  		octy[1]=octy[1]+8;
	  		octy[2]=octy[2]+8;
	  		octy[3]=octy[3]+8;
	  		octy[4]=octy[4]+8;
	  		octy[5]=octy[5]+8;
	  		octy[6]=octy[6]+8;
	  		octy[7]=octy[7]+8;
	  		
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
			
			octx[0]=octx[0]-8;
	  		octx[1]=octx[1]-8;
	  		octx[2]=octx[2]-8;
	  		octx[3]=octx[3]-8;
	  		octx[4]=octx[4]-8;
	  		octx[5]=octx[5]-8;
	  		octx[6]=octx[6]-8;
	  		octx[7]=octx[7]-8;			}
		if (oct==7){
			octy[0]=octy[0]-8;
	  		octy[1]=octy[1]-8;
	  		octy[2]=octy[2]-8;
	  		octy[3]=octy[3]-8;
	  		octy[4]=octy[4]-8;
	  		octy[5]=octy[5]-8;
	  		octy[6]=octy[6]-8;
	  		octy[7]=octy[7]-8;
	  		
	  		octx[0]=octx[0]-8;
	  		octx[1]=octx[1]-8;
	  		octx[2]=octx[2]-8;
	  		octx[3]=octx[3]-8;
	  		octx[4]=octx[4]-8;
	  		octx[5]=octx[5]-8;
	  		octx[6]=octx[6]-8;
	  		octx[7]=octx[7]-8;
			}
		 p1=new Polygon(octx,octy, octx.length);
	}
	
	public int getDD(){
		return octx.length;
	}
	/*public boolean ballCollison(int x[], int y[], int d){
		int disX = (x+d/2) - (Locy +dd/2);
		int disY = (y+d/2) - (Locx +dd/2);
		int radii = d/2 + dd/2;
		//System.out.println(disX + ", " + disY + ", " + radii);
		return (((disX * disX) + (disY * disY)) < (radii * radii));
		
		
	 
		Polygon p= new Polygon(octx,octy, octx.length);
		Polygon p2= new Polygon(x,y, octx.length); 
		
		if(p.intersects(p2.getBounds())){
			return true;
		}

		
			
		
		return false;
		
	}	*/ 
	
	 public static boolean ballCollison(Polygon p1,int x[], int y[], int d) {
		 Point p; 
		 Polygon p2=new Polygon(x,y,d);
		 for(int i = 0; i < p2.npoints;i++) {
			 p = new Point(p2.xpoints[i],p2.ypoints[i]);
			 if(p1.contains(p)) return true;
			 }
		 for(int i = 0; i < p1.npoints;i++)
		 { p = new Point(p1.xpoints[i],p1.ypoints[i]); 
		 if(p2.contains(p)) return true;
		 }
		 return false;
	 }
		 public void drawBall(Graphics g, int d, Color e){
		dd=d;
		g.setColor(e);
		g.fillPolygon(octx, octy, octx.length);
		g.setColor(Color.BLACK);
		g.drawPolygon(octx, octy, octx.length);
	}
}


//Alex did this class. Pretty much exactly the same as the enemy class



