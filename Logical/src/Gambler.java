import java.util.Scanner;
public class Gambler {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int stake,goal,bet,i,amount,wins=0,loss=0;
		System.out.println("Enter the stake of gambler");
		stake=in.nextInt();
		System.out.println("Enter the goal");
		goal=in.nextInt();
		System.out.println("Enter number of bets allowed for gambler");
		bet=in.nextInt();
			
		for(i=0;i<bet;i++)
		{
			while(stake>0 && stake<goal)
			{
				if(Math.random()<0.5)
				{
					stake++;
					wins++;
				}
				else
				{
					stake--;
					loss++;
				}
				break;
			}
		}
		System.out.println("Number of Wins= "+wins);
		System.out.println("Number of Loss= "+loss);
		System.out.println("Stake="+stake);
		System.out.println("Percentage of wins="+(wins*100)/bet);
		System.out.println("Percentage of Loss="+(loss*100)/bet);
	}
}
