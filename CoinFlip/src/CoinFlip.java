//import java.lang.Math;
import java.util.Scanner;
public class CoinFlip {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter  number of time the coin is to be flipped");
		int val,i,tails=0,heads=0;
		val=in.nextInt();
	
		for(i=0;i<val;i++)
		{
			if(Math.random()<0.5)
			{
				tails++;
			}
			
			else
			{
				heads++;
			}
		}
	
		System.out.println("Number of times Coin flipped= "+val);
		System.out.println("Tails=" +tails);
		System.out.println("Heads=" +heads);
		System.out.println("Percentage of heads= "+(heads*100)/val+"%");
		System.out.println("Percentage of tails= "+(tails*100)/val+"%");

	}

}
