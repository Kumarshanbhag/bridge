import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a,b;
		System.out.println("Enter 2 string to check anagram");
		a=sc.nextLine();
		b=sc.nextLine();
		int n1=a.length();
		int n2=b.length();
		int flag=0;
		if(n1==n2)
		{
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n2;j++)
				{
					if(a.charAt(i)==b.charAt(j))
					{
						flag=1;
						break;	
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
			{
				System.out.println("Both strings are anagram");
			}
			else
			{
				System.out.println("Both strings are not anagram");
			}
		}
		else
		{
			System.out.println("Both strings are not anagram");
		}
	}
}