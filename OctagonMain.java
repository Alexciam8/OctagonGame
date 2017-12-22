import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.*;

public class OctagonMain extends JPanel implements ActionListener, KeyListener{

	private Timer time=new Timer(50, this);
	private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	private ArrayList<PowerUp> powerups = new ArrayList<PowerUp>();
	private Shooter shooter= new Shooter(15,15,300,220);
	private  ArrayList<Missile> missiles = new ArrayList<Missile>();
	private  Boolean[] missilego= new Boolean[50];
	private  int octx[]= new int[8];
	private int octy[]= new int[8];
	private int superwaveLoc;
	private  Boolean superwave=false;
	private int enemycounter=0;
	private int shloc;
	private int k=0;
	private  Boolean missilesmove=false;
	private  Boolean missileshoot=false;
	private  int shooterx[]= new int[8];
	private  int shootery[]= new int[8];
	private int c1=0;
	private  JFrame frame=new JFrame();
	private Container can = frame.getContentPane();
	private  JPanel pane=new JPanel();
	private  JButton button=new JButton("play!");
	private Background back=new Background();
	private Color mis= new Color(102,0,51);
	private Color shoot= new Color(51,0,102);
	private Color oct= new Color(0,102,102);
	private boolean play=false;
	private boolean pause=false;
	private double scoreAdder=.5;
	private int countFreeze=0;
	private boolean freeze=false;
	private boolean scoreAdd=false;
	private int tripleScore=0;
	private int supercounter=0;
	private boolean supershoot=false;
	private  int pow=(int)((500-100+1)*Math.random()+100);
	private int bgcolor=0;
	private int circleish=600;
	private int circleish2=600;
	private int circle2x=0;
	private  int circle2y=0;
	private int circlex=0;
	private int circley=0;
	private boolean powerDraw=false;
	private int powerCount=0;
	private String power=" ";
	private  int hp=5;
	Life life=new Life(300,10,hp);
	private double score=0;
	JLabel label=new JLabel("Score : "+score+"     ");
	JOptionPane jpane=new JOptionPane();
	Music sound=new Music();
	Timer music=new Timer(3000,this);
	private int musicc=0;
	private String s;
	private int powerEffect;
	private int x1=10;
	private int x2=0;
	private int x3=15;
	private int x4=-20;
	private int x5=100;
	private int x6=150;
	private String octa="Octagon Pow Pow";
	private int slowItDown=0;

	public OctagonMain() {
		//Josh did the JFrame/JPanel items
		can.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600,600));    
		time.start();
		frame.addKeyListener(this);
		can.setLayout(new BorderLayout());
		button.setFocusable(false);
		pane.add(button);
		setBackground(Color.BLACK);
		pane.setBackground(Color.BLACK);
		can.add(pane,BorderLayout.SOUTH);
		can.add(this,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600,650));    
		frame.setTitle("OctagonPowPow");
		label.setForeground(Color.GREEN);
		pane.setLayout(new BorderLayout());
		pane.add(button, BorderLayout.WEST);
		pane.add(label, BorderLayout.EAST);
		sound.playSound();
		s=jpane.showInputDialog(frame, "Please enter your name before you begin the game.");
		if(s == null || (s != null && ("".equals(s)))){
			System.exit(0);
		}
		music.start();
		button.addActionListener(this);
		for (int x=0;x<missiles.size();x++){
			missilego[x]= false;
		}
		octx[0]=275;
		octx[1]=325;
		octx[2]=375;
		octx[3]=375;
		octx[4]=325;
		octx[5]=275;
		octx[6]=225;
		octx[7]=225;

		octy[0]=225;
		octy[1]=225;
		octy[2]=275;
		octy[3]=325;
		octy[4]=375;
		octy[5]=375;
		octy[6]=325;
		octy[7]=275;

		shooterx[0]=295;
		shooterx[1]=345;
		shooterx[2]=378;
		shooterx[3]=354;
		shooterx[4]=292;
		shooterx[5]=233;
		shooterx[6]=205;
		shooterx[7]=235;

		shootery[0]=205;
		shootery[1]=230;
		shootery[2]=290;
		shootery[3]=347;
		shootery[4]=376;
		shootery[5]=348;
		shootery[6]=290;
		shootery[7]=235;

		enemies.add(new Enemy(20,20,0,0, 1));
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		//Alex did the collision, movement, and powerups of the objects. Josh did the backgrounds, button functions, and sound fx
		if(hp<=0){
			button.setText("Close Game");
			time.stop();
			music.stop();
			sound.playSound5();
			label.setText(s+" Loses! "+s+"'s score is "+score);
			frame.setTitle("Game Over!");
			play=false;
			octa="You Lose!";
			if(e.getSource()==button){
				System.exit(0);
			}
		}
		if(play==true){
			//background weird noise that plays
			if(e.getSource()==music){
				musicc++;
				double ran=Math.random();

				if(ran<.5){
					sound.playSound3();
				}
				else{
					sound.playSound4();
				}
			}

			score=score+scoreAdder;

			frame.setTitle("Octagon Pow Pow Score: "+score);

			label.setText(s+"'s Score : "+score+"     ");
			button.setText("pause");
			if(e.getSource()==button){
				pause=!pause;
				if(pause==true){
					button.setText("resume");
					time.stop();
				}
				else if(pause==false){
					time.start();
					button.setText("pause");
				}
			}
		}
		if(e.getSource()==button){
			sound.playSound6();

			play=true;
		}
		//draws background color
		slowItDown++;
		if(slowItDown%3==0){
			bgcolor++;

			if(bgcolor==5){
				bgcolor=0;
			}
			circleish=circleish-14;
			if(circleish<0){
				circleish=600;
			}
			circlex=circlex+7;
			if(circlex>300){
				circlex=0;
			}
			circley=circley+7;
			if(circley>300){
				circley=0;
			}
			if(circleish<100){
				circleish2=circleish2-14;
				if(circleish2<0){
					circleish2=600;
				}
				circle2x=circle2x+7;
				if(circle2x>300){
					circle2x=0;
				}
				circle2y=circle2y+7;
				if(circle2y>300){
					circle2y=0;
				}
			}
		}
		x1=x1+10;
		if(x1>600){
			x1=-400;
		}
		x2=x2-4;
		if(x2<-400){
			x2=600;
		}
		x3=x3+6;
		if(x3>600){
			x3=-400;
		}
		x4--;
		if(x4<-400){
			x4=600;
		}
		x5=x5+2;
		if(x5>600){
			x5=-400;
		}
		x6=x6-13;
		if(x6<-400){
			x6=600;

		}

		if (play==true){
			for(int gg=0; gg<missiles.size();gg++){
				//tells the missiles to get off the array once they exit the screen
				if (missiles.get(gg).hasLaunched()==false){
					missiles.remove(gg);
					gg--;
				}
				else{
					missiles.get(gg).move();
					repaint();
				}

			}
			//tells the powerup display to go away
			if (powerDraw==true){
				powerCount++;
				if (powerCount==20){
					powerDraw=false;
					powerEffect=0;
					powerCount=0;
				}
			}

			if (freeze==false){
				for (int powgo=0; powgo<powerups.size();powgo++){
					powerups.get(powgo).move();
				}
				enemycounter++;

				if (enemycounter%500==0){
					superwave=true;
					superwaveLoc=(int)((8-1+1)*Math.random()+1);
				}

			}

			//freezes the screen
			if (freeze==true){
				countFreeze++;
				if (countFreeze==50){
					freeze=false;
					countFreeze=0;

				}
			}


			if (scoreAdd==true){
				tripleScore++;
			}
			if (tripleScore==100){
				scoreAdder=.5;
				tripleScore=0;
				scoreAdd=false;
			}
			if (enemycounter%pow==0){
				//determines the placement and rate of powerup spawning
				int powerupLoc=(int)((4-1+1)*Math.random()+1);
				powerups.add(new PowerUp(20,20,0,0, powerupLoc));
				pow=(int)((500-100+1)*Math.random()+100);
			}
			if (enemycounter%540==0){
				superwave=false;
			}

			if (superwave==true){
				//makes a large line of enemies appear
				if(enemycounter%3==0){

					enemies.add(new Enemy(20,20,0,0, superwaveLoc));
				}

			}
			if (supershoot==true){
				supercounter++;
				if (supercounter==100){
					supershoot=false;
					supercounter=0;
				}
			}
			if(superwave==false){
				if (enemycounter%800==0){
					//makes a ring of enemies appear
					enemies.add(new Enemy(20,20,0,0, 0));
					enemies.add(new Enemy(20,20,0,0, 1));
					enemies.add(new Enemy(20,20,0,0, 2));
					enemies.add(new Enemy(20,20,0,0, 3));
					enemies.add(new Enemy(20,20,0,0, 4));
					enemies.add(new Enemy(20,20,0,0, 5));
					enemies.add(new Enemy(20,20,0,0, 6));
					enemies.add(new Enemy(20,20,0,0, 7));
				}
				if(enemycounter%15==0){
					int ppp= (int)((8-1+1)*Math.random()+1);
					enemies.add(new Enemy(20,20,0,0, ppp));
				}
			}

			if (enemies.size()>0){
				for(int enemynumb=0; enemynumb<enemies.size();enemynumb++){
					if(freeze==false){
						enemies.get(enemynumb).move(1);
					}
					if(enemies.get(enemynumb).ballCollison(enemies.get(enemynumb).p1,octx,octy, octx.length)){
						//checks if the enemies collide with the main ocagon
						enemies.remove(enemies.get(enemynumb));
						hp--;
						//	sound.playSound7();
						enemynumb--;
						break;
					}
					for(int missilesnumb=0; missilesnumb<missiles.size();missilesnumb++){
						if(enemies.get(enemynumb).ballCollison(enemies.get(enemynumb).p1,missiles.get(missilesnumb).getx(),missiles.get(missilesnumb).gety(), missiles.get(missilesnumb).getDD())){
							//checks if the missiles collide with the enemies
							enemies.remove(enemies.get(enemynumb));
							missiles.remove(missiles.get(missilesnumb));
							enemynumb--;
							break;
						}

						for(int powernumb=0; powernumb<powerups.size();powernumb++){
							if(missiles.get(missilesnumb).ballCollison(missiles.get(missilesnumb).p1,powerups.get(powernumb).getx(),powerups.get(powernumb).gety(), powerups.get(powernumb).getDD())){
								//checks if the missiles collide with the poweru
								powerups.remove(powerups.get(powernumb));
								powernumb--;
								powerEffect=(int)((4-1+1)*Math.random()+1);
								if (powerEffect==1){
									supershoot=true;
									powerDraw=true;
								}
								if (powerEffect==2){
									hp=hp+1;
									powerDraw=true;
								}
								if (powerEffect==3){
									scoreAdder=1.5;
									scoreAdd=true;
									powerDraw=true;
								}
								if (powerEffect==4){
									freeze=true;
									powerDraw=true;
								}
								powerDraw=true;
								break;
							}
						}
					}
				}
			}
		}
		repaint();
	}

	public void keyPressed(KeyEvent e){
		int keyCode=e.getKeyCode();
		if(pause==false){
			//Alex did the KeyListeners
			if(keyCode==e.VK_D){
				shloc++;
				if (shloc>7){
					shloc=0;
				} 
				shooter.setLocx(shooterx[shloc]);
				shooter.setLocy(shootery[shloc]);
			}

			else if(keyCode==e.VK_A){
				shloc--;
				if (shloc<0){
					shloc=7;
				}
				shooter.setLocx(shooterx[shloc]);
				shooter.setLocy(shootery[shloc]);
			}

			if (supershoot==false){
				if(keyCode==e.VK_SPACE){
					sound.playSound2();

					missileshoot=true;
					missiles.add(new Missile(5,5,shooter.getx(),shooter.gety(),shloc));
				}
			}
			else if (supershoot==true){
				if(keyCode==e.VK_SPACE){

					missileshoot=true;
					missiles.add(new Missile(5,5,shooter.getx(),shooter.gety(),shloc));

					//adds missiles to either side of the shooter when supershoot is active. 
					if (shloc==0){
						missiles.add(new Missile(5,5,shooterx[1],shootery[1],1));
						missiles.add(new Missile(5,5,shooterx[7],shootery[7],7));
					}
					if (shloc==1){
						missiles.add(new Missile(5,5,shooterx[2],shootery[2],2));
						missiles.add(new Missile(5,5,shooterx[0],shootery[0],0));
					}
					if (shloc==2){
						missiles.add(new Missile(5,5,shooterx[3],shootery[3],3));
						missiles.add(new Missile(5,5,shooterx[4],shootery[4],4));
					}
					if (shloc==3){
						missiles.add(new Missile(5,5,shooterx[4],shootery[4],shloc+1));
						missiles.add(new Missile(5,5,shooterx[2],shootery[2],shloc-1));
					}
					if (shloc==4){
						missiles.add(new Missile(5,5,shooterx[5],shootery[5],shloc+1));
						missiles.add(new Missile(5,5,shooterx[3],shootery[3],shloc-1));
					}
					if (shloc==5){
						missiles.add(new Missile(5,5,shooterx[6],shootery[6],shloc+1));
						missiles.add(new Missile(5,5,shooterx[4],shootery[4],shloc-1));
					}
					if (shloc==6){
						missiles.add(new Missile(5,5,shooterx[5],shootery[5],5));
						missiles.add(new Missile(5,5,shooterx[7],shootery[7],7));
					}
					if (shloc==7){
						missiles.add(new Missile(5,5,shooterx[6],shootery[6],6));
						missiles.add(new Missile(5,5,shooterx[0],shootery[0],0));
					}




				}
			}
			repaint();
		}
	}
	public void keyReleased(KeyEvent e){}
	public void keyTyped(KeyEvent e){}


	public void paintComponent(Graphics g){
		super.paintComponent(g);
		if(play){
			//Alex did the drawing of the objects. Josh drew the menu screen and the background
			back.drawBackground(g,bgcolor,circleish,circleish2,circlex,circley,circle2x,circle2y);

			g.setColor(Color.WHITE);
			g.fillPolygon(octx, octy, octx.length);
			g.setColor(Color.BLACK);
			g.drawPolygon(octx, octy, octx.length);
			shooter.drawBall(g, 15, Color.BLUE);
			for (int y=1;y<missiles.size();y++){
				missiles.get(y).drawBall(g, 5, mis);
			}

			shooter.drawBall(g, 15, shoot);
			g.fillPolygon(octx, octy, octx.length);
			for(int gg4=0; gg4<enemies.size();gg4++){
				enemies.get(gg4).drawBall(g, 25, Color.RED); 
			}

			for(int gg5=0; gg5<powerups.size();gg5++){
				powerups.get(gg5).drawBall(g, 25, Color.CYAN); 
			}
			life.drawLife(g, hp);
			if (powerDraw==true){
				if (powerEffect==1){
					power ="SUPER SHOOT";

				}
				if (powerEffect==2){
					power ="EXTRA LIFE";

				}
				if (powerEffect==3){
					power ="TRIPLE POINTS";

				}
				if (powerEffect==4){
					power ="FREEZE";
				}
				g.setFont(new Font("Copperplate Gothic Bold",0,50));
				g.setColor(Color.CYAN);
				g.drawString(power, 40, 215);
				g.setColor(Color.RED);
				g.drawString(power, 40, 210);
			}
		}

		else{
			//draws main menu background. Josh did this background
			g.setColor(Color.GREEN);
			g.fillRect(x1,70,400,50);
			g.fillRect(x2,230,400,50);
			g.fillRect(x3,390,400,50);
			g.fillRect(x4,490,400,50);
			g.fillRect(x5,140,400,50);
			g.fillRect(x6,310,400,50);
			g.setFont(new Font("Copperplate Gothic Bold",0,50));

			g.setFont(new Font("Copperplate Gothic Bold",0,50));
			g.setColor(Color.CYAN);
			g.drawString(octa, 40, 215);
			g.setColor(Color.ORANGE);
			g.drawString(octa, 38, 211);
			g.setColor(Color.RED);
			g.drawString(octa, 40, 210);
		}
	}

	public static void main(String[] args){
		new OctagonMain();    
	}

}	
