import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name;
		name=sc.nextLine();
		if(name.length()>=3)
		{
			System.out.println("Hello "+name+", How are you?\"");
		}
		else
		{
			System.out.println("Name should be 3 characters");
		}
	}

}
