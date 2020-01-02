import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner in=new Scanner(System.in);
		int val=in.nextInt(),pow=1,i;
		if(val>=0 && val<31)
		{
			for(i=0;i<=val;i++)
			{
				System.out.println("Power of 2^" + i+ " = "+pow);
				pow=2*pow;
				
			}
			
		}
		else
		{
			System.out.println("value should be less than 31");
		}
		
	}

}
