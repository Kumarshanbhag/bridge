
public class Insertion {

	public static void main(String[] args) {
		String s[]= {"kumar","rajnish","samir","jitesh","sameer","kumar"};
		int n=s.length;
		String temp;
		for(int i=0;i<n;i++ )
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[i].compareToIgnoreCase(s[j])>0)
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}

}
