import java.applet.Applet;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Basics extends Applet implements ActionListener
{TextField tf;
Button b1,b2;Label l;
public Basics()
{tf=new TextField(20);
l=new Label("swfw");
b1=new Button("gog");
b2=new Button("Bad");
add(tf);add(l);add(b1);add(b2);b1.setActionCommand("good");b2.setActionCommand("bad");
b1.addActionListener(this);
b2.addActionListener(this);

}

	public void init()
	{
		
		
	}
	public void start()
	{
		System.out.println("start");
	}
	public void stop()
	{
		System.out.println("stop");
	}
	public void destroy()
	{
		System.out.println("destroy");
	}
	public void paint(Graphics g)
	
	{
		Color color=new Color(255,0,0);
		g.setColor(color);
		g.drawRect(100,100, 200, 100);
		g.fillRect(100,100, 200, 100);
		
		Color col=new Color(255,255,0);
		g.setColor(col);
		g.fillOval(100,100, 200, 100);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(tf.getText());
		// TODO Auto-generated method stub
		//int age=Integer.parseInt(tf.getText());
		/*if(e.getActionCommand().equals("good"))
		{
			System.out.println("good");
		}
		if(e.getActionCommand().equals("bad"))
		{
			System.out.println("bad");
		}
	*/
		if(e.getSource()==b1)
			System.out.println(a+" good");;
		if(e.getSource()==b2)
			System.out.println(a+" bad");;
	
	
	}
	
	
	
}
