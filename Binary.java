import java.util.Scanner;
class Binary
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int arr[]={1,2,3,4,5,6,7,8,9,10};		
		int min=0,max=arr.length-1,mid;
		Scanner sc=new Scanner(System.in);		
		String ch;
		
		while(min<max)
		{
			mid=(min+max)/2;
			System.out.println("Is your number "+ arr[mid]+" (Y/N): ");
			ch=sc.nextLine();
			if(ch.equals("y"))
			{
				System.out.println("Your number is found ");
				break;
			}
			else
			{
				System.out.println("Is your number<"+arr[mid]+" (Y/N)");
				ch=sc.nextLine();
				if(ch.equals("y"))
				{
					max=mid;
				}
				else
				{
					min=mid;
				}
			}
		}
	}
}


