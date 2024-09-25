// Infinite loop

class Recursion2{
	static int i=0;            // Static varible or instance varible initialize with 0
	static void show()         //recursion method()
	{
		++i;            //1, 2, 3, 4, 5
		if(i<=5) 	    // termination/base condition: to stop execution if condition is true.
		{
		System.out.println("Hi Girls, here Ashwini!!!"); // Hi Girls, here Ashwini!!!
		show();                 // recursive call
		}
	}
	public static void main(String[] args){
	show();                    // Call for method
	}
}

/*output : 5 times sop statements will execute
Hi Girls, here Ashwini!!!
Hi Girls, here Ashwini!!!
Hi Girls, here Ashwini!!!
Hi Girls, here Ashwini!!!
Hi Girls, here Ashwini!!!*/
