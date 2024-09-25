 
 class Recursion4{
	static int fact(int n) 5
	{
		if(n<=1) // basic/termination procedure //5<=1 , 4<=1 ,3<=1, 2<=1, 1<=1
			return 1; // 1
			return 1; // 1
		else
			return n*fact(n-1); // main logic //5*fact(4)   
											  //4*fact(3)
											  //3*fact(2)
											  //2*fact(1)
											  //fact(1)
	}
	public static void main(String[] args)
	{
		System.out.println(fact(5));  // call for method 5!=5*4*3*2*1 = 120
	}
 }
 
 // output : 120