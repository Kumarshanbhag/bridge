import java.util.Scanner;
import java.io.*;
public class ArrayFile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter rows and columns of matrix");
		m=sc.nextInt();
		n=sc.nextInt();
		int ar[][]=new int[m][n];
		System.out.println("Enter elements of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println();
		}
		try
		{
			FileOutputStream fout=new FileOutputStream("/home/kumar/Desktop/Java/Text/ArrayWriter.txt");
			PrintWriter out=new PrintWriter(new OutputStreamWriter(fout));
			out.write(ar+"");
			out.write("Kumar");
			out.flush();
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
