
class Recursion3{
	static int show(int n) // recursion method // 3, 4
	{
		if(n==4)	// basic condition //2==4 false goes to else block
			return n; //4
		else
			return 2*show(n+1); // show(2)....2*show(3)....2*2*show(4)....2*8=16
	}
	public static void main(String args[])
	{
		System.out.println(show(2));	// call for method //16
	}
}
//output : 16