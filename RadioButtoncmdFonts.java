import java.awt.*;
import java.awt.event.*;

class RadioButtoncmdFonts extends Frame implements ItemListener
{
	Checkbox chkBold,chkItalic,chkPlain;
	Label lbl;
        Button cmdApply;

RadioButtoncmdFonts(String title)

	{
	   super(title);


       this.setFont(new Font("Arial",Font.PLAIN,30));

     CheckboxGroup Font=new CheckboxGroup();

		chkBold=new Checkbox("BOLD",false,Font);
		chkItalic=new Checkbox("ITALIC",false,Font);
		chkPlain=new Checkbox("PLAIN",false,Font);



		lbl=new Label("D'Soft Computers");

		chkBold.addItemListener(this);
		chkItalic.addItemListener(this);
		chkPlain.addItemListener(this);

		//cmdDisplay=new Button("DISPLAY");
		//cmdDisplay.add ActionListener(this);

		Panel p1=new Panel();
		p1.setLayout(new GridLayout(1,3,5,5));

		p1.add(chkBold);
		p1.add(chkItalic);
		p1.add(chkPlain);

		this.add(p1,"Center");

		//p= new Panel();
	//	p.add(cmdDisplay);
	//	this.add(p,"SOUTH");

		Panel p2= new Panel();
	    p2.setLayout(new BorderLayout ());
	    p2.add(lbl);
		this.add(p2,"North");

		setSize(500,500);
		setVisible(true);
	}

public void itemStateChanged(ItemEvent ie)
{
	if(chkBold.getState()==true)
	  lbl.setFont(new Font("Arial",Font.BOLD,35));

	  if(chkItalic.getState()==true)
	  lbl.setFont(new Font("Arial",Font.ITALIC,35));

	  if(chkPlain.getState()==true)
       lbl.setFont(new Font("Arial",Font.PLAIN,35));


  }
  public static void main (String args[])
  {
	  new RadioButtoncmdFonts("Radio Button Fonts");
  }
}
