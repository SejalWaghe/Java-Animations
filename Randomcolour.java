import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.lang.Math;


public class Randomcolour extends Applet implements Runnable
{

    int x,y,z,p,q,r;
    String msg ="A Simple Moving Banner";
    Thread t=null;
    int state;
    boolean stopFlag;
    public void init()
    {
		z = 10;


        x=70;y=200;
		//setBackground(Color.yellow);
		//setForeground(Color.magenta);


		this.setFont(new Font("Arial",Font.BOLD,35));
	}
	public void start()
	{
		 msg=getParameter("message");
		 if(msg==null)
		 msg="Random Colour Generator";
		 msg=" "+msg;
		 t=new Thread(this);
		 t.start();
	 }
	 public void run()
	 {
		 char ch;
		 for(;;)
		 {
			 try
			 {
				 repaint();

                  //System.out.println(a);

				 if(z==10)
				  {
 						Random rand = new Random();
 						int p = rand.nextInt(255);
 						int q = rand.nextInt(255);
						int r = rand.nextInt(255);
				        this.setForeground(new Color(p,q,r));

				  }

				  Thread.sleep(500);
				  if(stopFlag)
				   break;
			   }catch(InterruptedException e){}
		   }
	   }
	   public void paint (Graphics g)
	   {
		   g.drawString(msg,x,y);
	   }
   }