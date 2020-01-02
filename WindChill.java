class  WindChill
{
	public static void main(String args[])
	{
		int t=Integer.parseInt(args[0]);	
		int v=Integer.parseInt(args[1]);	
		double w,sq;
		if(Math.abs(t)>50 && v<120 && v>3)
		{
			sq=Math.pow(v,0.16);		
			w=35.74+0.6215*t+(0.4275*t-35.75)*sq;
			System.out.println("Windchill= "+w);
		}
		else
		{
			System.out.println("Enter Valid range for temperature is <50 farheinheit and wind speed is greater than 3 and less than 120  miles per hour");
		}

	}
}
