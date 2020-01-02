import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Bubble {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<a.size()-i-1;j++)
			{
				if(a.get(j)>a.get(j+1))
				{
					Collections.swap(a, j, j+1);
				}
			}
			System.out.println("Iteration "+ i + ""+ a);
		}
		
	}

}
