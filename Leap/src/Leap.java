import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int year,rev=0,rem,temp,count=0;
		System.out.println("Enter Year");
		year=in.nextInt();
		temp=year;
		while(temp>0)
		{
			rem=temp%10;
			temp=temp/10;
			rev=rev*10+rem;
			count++;
		}
		if(count==4)
		{
			if((year%4==0) && (year%100!=0) || (year%400==0))
			{
				System.out.println(year +" is a leap year");
			}
			else
			{
				System.out.println(year+" is not Leap year");
			}
		}
		else
		{
			System.out.println("Year should be 4 digit");
		}
	}

}
