import java.util.ArrayList;

public class Primerange {

	public static void main(String[] args) {
		int n,i,j,k,flag=0,count=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
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
	
		System.out.println("Palindrome of prime in range 0 to 1000 are :");
		int c=0;
		for(j=0;j<a.size();j++)
		{
			int sum = 0,rem,temp,tmp;
			temp=a.get(j);
			tmp=temp;
			while(tmp>0)
			{
				rem=tmp%10;
				sum=sum*10+rem;
				tmp=tmp/10;
			}
			if(temp==sum)
			{
				System.out.print(temp+"\t");
				c++;
			}
		}
		System.out.print("\ncount="+c);
		
	/*	System.out.println("Anagram of prime in range 0 to 1000 are :");
		for(k=0;k<a.size();k++)
		{
			int sum = 0,rem,temp,tmp;
			temp=a.get(k);
			tmp=temp;
			while(tmp>0)
			{
				rem=tmp%10;
				sum=sum*10+rem;
				tmp=tmp/10;
			}
			
		}
	*/	
		
	}

}
