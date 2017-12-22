import java.awt.*;


public class Life {


    private int locX;


    private int locY;


    private int hp;


    public Life(int x,int y,int life){


        locX=x;


        locY=y;


        hp=life;


    }


    public void drawLife(Graphics g,int life){
    	hp=life;
        for(int x=0;x<hp;x++){


            g.setColor(Color.WHITE);


            g.fillOval(locX+25*x, locY, 20, 20);


        }


    }


}
//Josh did this class




