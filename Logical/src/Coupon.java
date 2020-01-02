import java.util.Random;
import java.util.Scanner;
public class Coupon {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to generate N distinct coupons:");
		int n;
		n=sc.nextInt();
		int arr[]=new int[n];
		int num=irandom(n);
		System.out.println(num);
	}
	
	public static int irandom(int n)
	{
		boolean collected[]=new boolean[n];
		int distinct=0,count=0,coupon;
		Random r=new Random();
		
		while(distinct<n)
		{
			coupon=r.nextInt(n);
			count++;
			if(!collected[coupon])
			{
				distinct++;
				collected[coupon]=true;
			}
		}
		return count;
	}
}

	

