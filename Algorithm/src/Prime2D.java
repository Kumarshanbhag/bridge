import java.util.ArrayList;

public class Prime2D 
{
	public static void main(String[] args) 
	{
		int n,i,flag=0,count=0,count1=0,p=100;
		ArrayList<Integer> a=new ArrayList<Integer>();
		int arr[][]=new int[10][];
		for(n=0;n<1000;n++)
		{
			for(i=n;i>=1;i--)
			{
				if(n%i==0)
				{
					flag=flag+1;
				}
			}
			if(flag==2)
			{
				a.add(n);
				count++;
			}
			flag=0;
		}
		System.out.println("Prime Number in range 0 to 1000 are :");
		System.out.println(a+"\t");
		System.out.println(count);
		
		for(i=0;i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}
