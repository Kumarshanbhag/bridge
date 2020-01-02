import java.util.Scanner;
public class triplezero {

	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			int size,i,k,u,m;
			System.out.println("Enter size of array");
			size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter values in array");
			for(i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(k=0;k<size-2;k++)
			{
				for(u=k+1;u<size-1;u++)
				{
					for(m=u+1;m<size;m++)
					{
						if(arr[k]+arr[u]+arr[m]==0)
						{
							System.out.println(arr[k]+"+"+arr[u]+"+"+arr[m]+"=0");
						}
					}
				}
			}
	}

}
