import java.util.Scanner;
import java.lang.Math;
public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double delta,root1,root2,sq1;
		System.out.println("Enter values for a,b  & c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		delta=Math.pow(b,2)-(4*a*c);
		sq1=Math.sqrt(Math.abs(delta));
		root1=(-b+sq1)/(2*a);
		root2=(-b-sq1)/(2*a);
		System.out.println("Delta= "+delta);
		System.out.println("Root1 of x= "+root1);
		System.out.println("Root2 of x= "+root2);
	}

}
