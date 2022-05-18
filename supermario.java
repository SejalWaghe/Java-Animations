/*<applet code="supermario.class"width=700 height=700>
</applet>*/

import java.awt.*;
import java.applet.*;
public class supermario extends Applet implements Runnable
{
	Image supermarioPics[]=new Image[19];
	Image Img;
	Thread th;
	int x;
	int y=50;

	public void init()
	{
		String supermarioSrc[]={"frame_00_delay-0.1s.jpg","frame_01_delay-0.1s.jpg","frame_02_delay-0.1s.jpg","frame_03_delay-0.1s.jpg","frame_04_delay-0.1s.jpg","frame_05_delay-0.1s.jpg","frame_06_delay-0.1s.jpg","frame_07_delay-0.1s.jpg","frame_08_delay-0.1s.jpg","frame_09_delay-0.1s.jpg","frame_10_delay-0.1s.jpg","frame_11_delay-0.1s.jpg","frame_12_delay-0.1s.jpg","frame_13_delay-0.1s.jpg","frame_14_delay-0.1s.jpg","frame_15_delay-0.1s.jpg","frame_16_delay-0.1s.jpg","frame_17_delay-0.1s.jpg","frame_18_delay-0.1s.jpg","frame_19_delay-0.1s.jpg"};

		for (int i=0;i<supermarioPics.length;i++)
		{
			supermarioPics[i]=getImage(getCodeBase(),"Images/imgs/"+supermarioSrc[i]);
		}
		setSize(700,700);
	}
	public void start ()
	{
		if(th==null){
			th=new Thread(this);
			th.start();
		}
	}
	public void stop()
	{
		th=null;
	}
	public void run()
	{
		setBackground(Color.white);
		supermarioRun(0,350);
		//Img=supermario  Pics[2];
		repaint();
		//pause(1000);

	}
	void supermarioRun(int start,int end)
	{
		for(int i=start;i<end;i++)
		{
			x=i;
			if(Img==supermarioPics[0])
               Img=supermarioPics[1];
            else if(Img==supermarioPics[1])
              Img=supermarioPics[2];
            else if(Img==supermarioPics[2])
              Img=supermarioPics[3];
            else if(Img==supermarioPics[3])
              Img=supermarioPics[4];
            else if(Img==supermarioPics[4])
              Img=supermarioPics[5];
            else if(Img==supermarioPics[5])
              Img=supermarioPics[6];
            else if(Img==supermarioPics[6])
              Img=supermarioPics[7];
            else if(Img==supermarioPics[7])
              Img=supermarioPics[8];
            else if(Img==supermarioPics[8])
              Img=supermarioPics[9];
            else if(Img==supermarioPics[9])
              Img=supermarioPics[10];
            else if(Img==supermarioPics[10])
              Img=supermarioPics[11];
            else if(Img==supermarioPics[11])
              Img=supermarioPics[12];
            else if(Img==supermarioPics[12])
              Img=supermarioPics[13];
            else if(Img==supermarioPics[13])
              Img=supermarioPics[14];
            else if(Img==supermarioPics[14])
              Img=supermarioPics[15];
            else if(Img==supermarioPics[15])
              Img=supermarioPics[16];
           else if(Img==supermarioPics[16])
              Img=supermarioPics[17];
           else if(Img==supermarioPics[17])
              Img=supermarioPics[18];
           else if(Img==supermarioPics[18])
              Img=supermarioPics[19];

           else
              Img=supermarioPics[0];


	        repaint();
	        pause(0);
		}
	}


	 void pause(int time)
	 {
		 try
		  {
			 Thread.sleep(150);
		  } catch(InterruptedException e){}
     }
	 public void paint (Graphics screen)
	 {
		 if(Img!=null)
		 {

		    screen.drawImage(Img,x,y,this);
		}
	 }
}

