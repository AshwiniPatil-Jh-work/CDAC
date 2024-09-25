class Recursion1{
	
	static void show()               //Static method() 
	{
		System.out.println("Hi Girls !!!"); // Hi Girls !!!
		show();                             // Recursive show method
	}
	public static void main(String args[])  // main method
	{
		show();								// method calling funtion
	}
}

// output : It will goes into the infinite loop but now a day we can not have to press ctrl+c to end the program or to stop the execution of the program flow. because It will stop automatically untill the allocated memory is used.