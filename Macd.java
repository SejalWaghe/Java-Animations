import java.awt.*;
import java.applet.*;
import java.util.Random;
import java.lang.Math;


public class Macd extends Applet implements Runnable
{
     Image MacdPics[]=new Image[39];
	 	Image Img;
	 	Thread th;
	 	int p;
	    int q=50;
    int x,y,z;
    String msg ="A Simple Moving Banner";
    Thread t=null;
    int state;
    boolean stopFlag;
    public void init()
    {

		String MacdSrc[]={"frame_00_delay-0.04s.jpg","frame_01_delay-0.04s.jpg","frame_02_delay-0.04s.jpg","frame_03_delay-0.04s.jpg","frame_04_delay-0.04s.jpg","frame_05_delay-0.04s.jpg","frame_06_delay-0.04s.jpg","frame_07_delay-0.04s.jpg","frame_08_delay-0.04s.jpg","frame_09_delay-0.04s.jpg","frame_10_delay-0.04s.jpg","frame_11_delay-0.04s.jpg","frame_12_delay-0.04s.jpg","frame_13_delay-0.04s.jpg","frame_14_delay-0.04s.jpg","frame_15_delay-0.04s.jpg","frame_16_delay-0.04s.jpg","frame_17_delay-0.04s.jpg","frame_18_delay-0.04s.jpg","frame_19_delay-0.04s.jpg","frame_20_delay-0.04s.jpg","frame_21_delay-0.04s.jpg","frame_22_delay-0.04s.jpg","frame_23_delay-0.04s.jpg","frame_24_delay-0.04s.jpg","frame_25_delay-0.04s.jpg","frame_26_delay-0.04s.jpg","frame_27_delay-0.04s.jpg","frame_28_delay-0.04s.jpg","frame_29_delay-0.04s.jpg","frame_30_delay-0.04s.jpg","frame_31_delay-0.04s.jpg","frame_32_delay-0.04s.jpg","frame_33_delay-0.04s.jpg","frame_34_delay-0.04s.jpg","frame_35_delay-0.04s.jpg","frame_36_delay-0.04s.jpg","frame_37_delay-0.04s.jpg","frame_38_delay-0.04s.jpg","frame_39_delay-0.04s.jpg"};

		for (int i=0;i<MacdPics.length;i++)
		{
			MacdPics[i]=getImage(getCodeBase(),"Images/imgs1/"+MacdSrc[i]);
		}

		z = 10;

        x=70;y=200;
		setBackground(Color.white);
		setForeground(Color.red);


		//this.setFont(new Font("Arial",Font.BOLD,45));
	}
	public void start()
	{
		 if(th==null){
			th=new Thread(this);
			th.start();
		}
		msg=getParameter("message");
		 if(msg==null)
		 msg="I'm Lovin'it";
		 msg=" "+msg;
		 t=new Thread(this);
		 t.start();
	 }
	 public void stop()
	 	{
	 		th=null;
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
						int z = rand.nextInt(75);
				        this.setFont(new Font("Arial", Font.BOLD, z));
                         //th.join();
				                           setBackground(Color.white);
										     MacdRun(800,900);
									   		    repaint();


				  }

				  Thread.sleep(100);

				  if(stopFlag)
				   break;

			   }catch(InterruptedException e){}


		   }

	   }
	   void MacdRun(int start,int end)
	   	{
	   		for(int i=start;i<end;)
	   		{
	   			x=i;
	   			if(Img==MacdPics[0])
	                  Img=MacdPics[1];
	               else if(Img==MacdPics[1])
	                 Img=MacdPics[2];
	               else if(Img==MacdPics[2])
	                 Img=MacdPics[3];
	               else if(Img==MacdPics[3])
	                 Img=MacdPics[4];
	               else if(Img==MacdPics[4])
	                 Img=MacdPics[5];
	               else if(Img==MacdPics[5])
	                 Img=MacdPics[6];
	               else if(Img==MacdPics[6])
	                 Img=MacdPics[7];
	               else if(Img==MacdPics[7])
	                 Img=MacdPics[8];
	               else if(Img==MacdPics[8])
	                 Img=MacdPics[9];
	               else if(Img==MacdPics[9])
	                 Img=MacdPics[10];
	               else if(Img==MacdPics[10])
	                 Img=MacdPics[11];
	               else if(Img==MacdPics[11])
	                 Img=MacdPics[12];
	               else if(Img==MacdPics[12])
	                 Img=MacdPics[13];
	               else if(Img==MacdPics[13])
	                 Img=MacdPics[14];
	               else if(Img==MacdPics[14])
	                 Img=MacdPics[15];
	               else if(Img==MacdPics[15])
	                 Img=MacdPics[16];
	              else if(Img==MacdPics[16])
	                 Img=MacdPics[17];
	              else if(Img==MacdPics[17])
	                 Img=MacdPics[18];
	              else if(Img==MacdPics[18])
	                 Img=MacdPics[19];
	              else if(Img==MacdPics[19])
	                 Img=MacdPics[20];
	                   else if(Img==MacdPics[20])
	                 Img=MacdPics[21];
	                 else if(Img==MacdPics[21])
	                 Img=MacdPics[22];
	                 else if(Img==MacdPics[22])
	                 Img=MacdPics[23];
	                 else if(Img==MacdPics[23])
	                 Img=MacdPics[24];
	                 else if(Img==MacdPics[24])
	                 Img=MacdPics[25];
	                 else if(Img==MacdPics[25])
	                 Img=MacdPics[26];
	                 else if(Img==MacdPics[26])
	                 Img=MacdPics[27];
	              else if(Img==MacdPics[27])
	                 Img=MacdPics[28];
	                 else if(Img==MacdPics[28])
	                 Img=MacdPics[30];
	                 else if(Img==MacdPics[31])
	                 Img=MacdPics[32];
	                 else if(Img==MacdPics[32])
	                 Img=MacdPics[33];
	                 else if(Img==MacdPics[33])
	                 Img=MacdPics[34];
	                 else if(Img==MacdPics[34])
	                 Img=MacdPics[35];
	                 else if(Img==MacdPics[35])
	                 Img=MacdPics[36];
	                 else if(Img==MacdPics[36])
	                 Img=MacdPics[37];
	                 else if(Img==MacdPics[37])
	                 Img=MacdPics[38];
	                 else if(Img==MacdPics[38])
	                 Img=MacdPics[39];
	              else
	                 Img=MacdPics[0];


	   	        repaint();
	   	        pause(80);
		    }
		}

		 void pause(int time)
		 {
			 try
			  {
				 Thread.sleep(time);
			  } catch(InterruptedException e){}
     }
	   public void paint (Graphics g)
        {
			if(Img !=null)
		     {
			    g.drawImage(Img,p,q,this);
		     }
             g.drawString(msg,x,y);
        }
}