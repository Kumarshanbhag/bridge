
public class MergeSort 
{
	public static void main(String[] args)
	{
		String arr[]= {"jitesh","mangesh","kumar","rajnish","bholu","sameer","samrin","kumar"};
		printarray(arr);
		int n=arr.length;
		mergesort(arr,0,n-1);
		System.out.println("\nSorted Array");
		printarray(arr);
		
	}
	
	static void printarray(String a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
	}
	
	static void mergesort(String a[],int i,int j)
	{
		int s=i,e=j,m;
		if(e>s)
		{
			m=(s+e)/2;
			mergesort(a,s,m);
			mergesort(a,m+1,e);
			merge(a,s,m,e);
		}
	}
	
	static void merge(String a[],int s,int m,int e)
	{
		String temp[] = new String[e - s+ 1];
		int i = s, j = m+1, k = 0;
		while(i <= m && j <= e) 
		{
			if(a[i].compareToIgnoreCase(a[j])<0) 
			{
				temp[k] = a[i];
				k ++; i ++;
			}
			else
			{
				temp[k] = a[j];
				k ++; j ++;
			}
		}
		
		while(i <= m) 
		{
			temp[k] = a[i];
			k ++; i ++;
		}

		while(j <= e) 
		{
			temp[k] = a[j];
			k ++; j ++;
		}

		for(i = s; i <= e; i++)
		{
			a[i] = temp[i - s];
		}

	}

}
