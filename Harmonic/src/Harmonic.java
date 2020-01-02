import java.util.Scanner;
public class Harmonic {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		double harm=0.0,i;
		for(i=1;i<=n;i++)
		{
			harm=harm+(1/i);
		}
		System.out.println(harm);

	}

}
