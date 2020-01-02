import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
public class stopwatch {

	public static void main(String[] args) 
	{
		long start,end,diff;
		JFrame f=new JFrame();
		JButton b1=new JButton("Start");
		JButton b2=new JButton("Stop");
		b1.setBounds(100,100,200,40);
		b2.setBounds(200,200,200,240);
	    Pass p=new Pass();
	
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				long start=System.currentTimeMillis();
				System.out.println("Starttime= "+start);
				p.start(start);
				
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				long stop=System.currentTimeMillis();
				System.out.println("Stop time= "+stop);
				long st,diff;
				st=p.get();
				diff=stop-st;
				long t=TimeUnit.MILLISECONDS.toMinutes(diff);
				long s=TimeUnit.MILLISECONDS.toSeconds(diff);
				System.out.println("Elapsedtime= "+t+"m:"+s+"s");
			}
		});
		
		
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.add(b1);
		f.add(b2);
	}
}

class Pass
{
	long st; 
	public long start(long a)
	{
		st=a;
		return st;
	}
	public long get()
	{
		return st;
	}
}
