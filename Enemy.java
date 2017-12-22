import javax.swing.*;


import java.awt.*;


public class Enemy {
	private int octx[]= new int[8];
   private  int octy[]= new int[8];
    private int oct;
	private int Locx=(int)((500-10+1)*Math.random()+1);
	private int ox0=-5;
	private int ox1=5;
	private int ox2=-5;
	private int ox3=15;
	private int ox4=5;
	private int ox5=-5;
	private int ox6=-15;
	private int ox7=-15;
	Polygon p1= new Polygon(octx,octy, octx.length);
	
	private int oy0=-15;
	private int oy1=-15;
	private int oy2=-5;
	private int oy3=5;
	private int oy4=15;
	private int oy5=15;
	private int oy6=5;
	private int oy7=-5;


	private int Locy=(int)((500-10+1)*Math.random()+1);
	private int Dx;
	private int Dy;
	private int dd=25;
	//private private Color e;
	private int width;
	private int height;
	
	public Enemy(int w, int h,int x,int y, int octSect){
	
		 width=w;
		 height=h;
		 Locx=x;
		 Locy=y;
				octx[0]=(-5);
			   	octx[1]=(5);
			   	octx[2]=(-5);
			   	octx[3]=15;
			  	octx[4]=5;
			  	octx[5]=-5;
			  	octx[6]=-15;
		  		octx[7]=-15;
			   		
		  		octy[0]=-15;
		  		octy[1]=-15;
		  		octy[2]=-5;
		  		octy[3]=5;	
		  		octy[4]=15;
		  		octy[5]=15;
		  		octy[6]=5;
			   	octy[7]=-5;
	   	
	   oct=octSect;
	   
	   if (octSect==4){
			octx[0]=(595);
		   	octx[1]=(605);
		   	octx[2]=(595);
		   	octx[3]=615;
		  	octx[4]=605;
		  	octx[5]=595;
		  	octx[6]=585;
	  		octx[7]=585; 
	  		
	  		octy[0]=585;
	  		octy[1]=585;
	  		octy[2]=595;
	  		octy[3]=605;	
	  		octy[4]=615;
	  		octy[5]=615;
	  		octy[6]=605;
		   	octy[7]=595;
		   	
	   }
	   if (octSect==1){
			octx[0]=(295);
		   	octx[1]=(305);
		   	octx[2]=(295);
		   	octx[3]=315;
		  	octx[4]=305;
		  	octx[5]=295;
		  	octx[6]=285;
	  		octx[7]=285; 
	   }
	   if (octSect==6){
		   octx[0]=(595);
		   	octx[1]=(605);
		   	octx[2]=(595);
		   	octx[3]=615;
		  	octx[4]=605;
		  	octx[5]=595;
		  	octx[6]=585;
	  		octx[7]=585; 
	   }
	   if (octSect==5){
			octx[0]=(295);
		   	octx[1]=(305);
		   	octx[2]=(295);
		   	octx[3]=315;
		  	octx[4]=305;
		  	octx[5]=295;
		  	octx[6]=285;
	  		octx[7]=285;
	  		
	  		octy[0]=585;
	  		octy[1]=585;
	  		octy[2]=595;
	  		octy[3]=605;	
	  		octy[4]=615;
	  		octy[5]=615;
	  		octy[6]=605;
		   	octy[7]=595;
	   }
	   if (octSect==7){
		   octy[0]=285;
	  		octy[1]=285;
	  		octy[2]=295;
	  		octy[3]=305;	
	  		octy[4]=315;
	  		octy[5]=315;
	  		octy[6]=305;
		   	octy[7]=295;
		   	
	   }
	   
	   if (octSect==3){
		   octy[0]=285;
	  		octy[1]=285;
	  		octy[2]=295;
	  		octy[3]=305;	
	  		octy[4]=315;
	  		octy[5]=315;
	  		octy[6]=305;
		   	octy[7]=295;
		   	
		    octx[0]=(595);
		   	octx[1]=(605);
		   	octx[2]=(595);
		   	octx[3]=615;
		  	octx[4]=605;
		  	octx[5]=595;
		  	octx[6]=585;
	  		octx[7]=585; 
		   	
	   }
	   if (octSect==2){
		
		   octy[0]=585;
	  		octy[1]=585;
	  		octy[2]=595;
	  		octy[3]=605;	
	  		octy[4]=615;
	  		octy[5]=615;
	  		octy[6]=605;
		   	octy[7]=595;
	   }
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


	public void move(int x){
		/*octx[0]=octx[0]+x;
	   	octx[1]=octx[1]+x;
	   	octx[2]=octx[2]+x;
	   	octx[3]=octx[3]+x;
	  	octx[4]=octx[4]+x;
	  	octx[5]=octx[5]+x;
	  	octx[6]=octx[6]+x;
  		octx[7]=octx[7]+x;
	   		
  		octy[0]=octy[0]+x;
	   	octy[1]=octy[1]+x;
	   	octy[2]=octy[2]+x;
	   	octy[3]=octy[3]+x;
	  	octy[4]=octy[4]+x;
	  	octy[5]=octy[5]+x;
	  	octy[6]=octy[6]+x;
  		octy[7]=octy[7]+x;
		//System.out.println(octx[0]);*/
  		
  		if (oct==5){
  			
	   		
	  		octy[0]=octy[0]-4;
	  		octy[1]=octy[1]-4;
	  		octy[2]=octy[2]-4;
	  		octy[3]=octy[3]-4;
	  		octy[4]=octy[4]-4;
	  		octy[5]=octy[5]-4;
	  		octy[6]=octy[6]-4;
	  		octy[7]=octy[7]-4;
			;
		}
		if (oct==6){


			octy[0]=octy[0]+4;
	  		octy[1]=octy[1]+4;
	  		octy[2]=octy[2]+4;
	  		octy[3]=octy[3]+4;
	  		octy[4]=octy[4]+4;
	  		octy[5]=octy[5]+4;
	  		octy[6]=octy[6]+4;
	  		octy[7]=octy[7]+4;
	  		
	  		octx[0]=octx[0]-4;
	  		octx[1]=octx[1]-4;
	  		octx[2]=octx[2]-4;
	  		octx[3]=octx[3]-4;
	  		octx[4]=octx[4]-4;
	  		octx[5]=octx[5]-4;
	  		octx[6]=octx[6]-4;
	  		octx[7]=octx[7]-4;	}
		if (oct==7){


			octx[0]=octx[0]+4;
	  		octx[1]=octx[1]+4;
	  		octx[2]=octx[2]+4;
	  		octx[3]=octx[3]+4;
	  		octx[4]=octx[4]+4;
	  		octx[5]=octx[5]+4;
	  		octx[6]=octx[6]+4;
	  		octx[7]=octx[7]+4;
			}
		if (oct==8){


			octy[0]=octy[0]+4;
	  		octy[1]=octy[1]+4;
	  		octy[2]=octy[2]+4;
	  		octy[3]=octy[3]+4;
	  		octy[4]=octy[4]+4;
	  		octy[5]=octy[5]+4;
	  		octy[6]=octy[6]+4;
	  		octy[7]=octy[7]+4;
	  		
			octx[0]=octx[0]+4;
	  		octx[1]=octx[1]+4;
	  		octx[2]=octx[2]+4;
	  		octx[3]=octx[3]+4;
	  		octx[4]=octx[4]+4;
	  		octx[5]=octx[5]+4;
	  		octx[6]=octx[6]+4;
	  		octx[7]=octx[7]+4;
			}
		if (oct==1){
			
			octy[0]=octy[0]+4;
	  		octy[1]=octy[1]+4;
	  		octy[2]=octy[2]+4;
	  		octy[3]=octy[3]+4;
	  		octy[4]=octy[4]+4;
	  		octy[5]=octy[5]+4;
	  		octy[6]=octy[6]+4;
	  		octy[7]=octy[7]+4;
			}
		if (oct==2){
			octy[0]=octy[0]-4;
	  		octy[1]=octy[1]-4;
	  		octy[2]=octy[2]-4;
	  		octy[3]=octy[3]-4;
	  		octy[4]=octy[4]-4;
	  		octy[5]=octy[5]-4;
	  		octy[6]=octy[6]-4;
	  		octy[7]=octy[7]-4;
	  		
	  		octx[0]=octx[0]+4;
	  		octx[1]=octx[1]+4;
	  		octx[2]=octx[2]+4;
	  		octx[3]=octx[3]+4;
	  		octx[4]=octx[4]+4;
	  		octx[5]=octx[5]+4;
	  		octx[6]=octx[6]+4;
	  		octx[7]=octx[7]+4;
			}
		if (oct==3){
			
			octx[0]=octx[0]-4;
	  		octx[1]=octx[1]-4;
	  		octx[2]=octx[2]-4;
	  		octx[3]=octx[3]-4;
	  		octx[4]=octx[4]-4;
	  		octx[5]=octx[5]-4;
	  		octx[6]=octx[6]-4;
	  		octx[7]=octx[7]-4;			}
		if (oct==4){
			octy[0]=octy[0]-4;
	  		octy[1]=octy[1]-4;
	  		octy[2]=octy[2]-4;
	  		octy[3]=octy[3]-4;
	  		octy[4]=octy[4]-4;
	  		octy[5]=octy[5]-4;
	  		octy[6]=octy[6]-4;
	  		octy[7]=octy[7]-4;
	  		
	  		octx[0]=octx[0]-4;
	  		octx[1]=octx[1]-4;
	  		octx[2]=octx[2]-4;
	  		octx[3]=octx[3]-4;
	  		octx[4]=octx[4]-4;
	  		octx[5]=octx[5]-4;
	  		octx[6]=octx[6]-4;
	  		octx[7]=octx[7]-4;
			}
		 p1=new Polygon(octx,octy, octx.length);


	}
	
	//different collison method. Half works
	/*public boolean ballCollison(int x[], int y[], int d){
		int disX = (x+d/2) - (Locy +dd/2);
		int disY = (y+d/2) - (Locx +dd/2);
		int radii = d/2 + dd/2;
		//System.out.println(disX + ", " + disY + ", " + radii);
		return (((disX * disX) + (disY * disY)) < (radii * radii));
		
		
	
		Polygon p1= new Polygon(octx,octy, octx.length);
		Polygon p2= new Polygon(x,y, octx.length); 
		
		if(p.intersects(p2.getBounds())){
			return true;
		}


		
			
		
		return false;
		
	}*/
	//good collision method
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
		g.setColor(e);
	
		g.fillPolygon(octx, octy, octx.length);
	
	}
}




//Alex did this class. The code from the collison was taken from http://wikicode.wikidot.com/check-for-polygon-polygon-intersection






