import java.util.Scanner;
public class Stringpremutation 
{
	static int count=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		permute(s,0,n-1);
		
	}
		
	static void permute(String s,int l,int r)
	{	
			
			if(l==r)
			{   
				count++;
				System.out.println(s+"\t"+count);	
			
			}
			else
			{
				for(int i=l;i<=r;i++)
				{
					s=swap(s,l,i);
					permute(s,l+1,r);
					s=swap(s,l,i);
					
				}
			}
			
	}
	
	static String swap(String s,int l,int r)
	{
		char c[]=s.toCharArray();
		char temp=c[l];
		c[l]=c[r];
		c[r]=temp;
		return s.valueOf(c);
	}
}
