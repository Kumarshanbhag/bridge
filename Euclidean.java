import java.util.*;
import java.lang.Math;
class Euclidean
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		double distance;
		n1=Integer.parseInt(args[0]);
		n2=Integer.parseInt(args[1]);
		distance=Math.pow(n1,2)+Math.pow(n2,2);
		System.out.println("Distance= "+ Math.sqrt(distance));
	
	}
}

