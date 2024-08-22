class Largestof
{
	public static void main(String args[])
	{
		int a=100;
		int b=20;
		int c=30;
		if(a>b && a>c)
		{
			System.out.println("A is Largest Number: " +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("B is Largest Number: "+b);
		}
		else if(c>a && c>b)
		{
			System.out.println("C is Largest Number: "+c);
		}
		else
		{
			System.out.println("All are same numbers");
		}
	}
}
