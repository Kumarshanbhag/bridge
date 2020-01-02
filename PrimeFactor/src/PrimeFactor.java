import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int no=in.nextInt(),i;
		for(i=2;i<=no;i++)
		{
			while(no%i==0)
			{
				System.out.print(i+"\t");
				no=no/i;
			}
		}
	}

}
