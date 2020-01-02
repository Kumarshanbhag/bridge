import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class BinarySearch 
{
	public static void main(String[] args)throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
		
		try 
		{
			File file=new File("/home/kumar/Desktop/Java/Text/Text.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String st;
			String t[]=null;
			while((st=br.readLine())!=null)
			{
				t=st.split(" ");	
				
			}
			Arrays.sort(t);
			for(int i=0;i<t.length;i++)
			{
				System.out.print(t[i]+" ");
			}
			System.out.println("\nEnter the word you want to search");
			String find=sc.nextLine();
			int n=t.length, min=0 , max=n-1, mid=0; 
			while(max>=min)
			{
				mid=max+min/2;
				if(t[mid].compareTo(find)==0)
				{
						System.out.println(t[mid]+" is at location "+mid);
						break;
				}
				else
				{
					if(t[mid].compareTo(find)==-1)
					{
						min=mid+1;
					}
					else
					{
						max=mid-1;
					}
				}
			}
			
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}

	
		
	
}
