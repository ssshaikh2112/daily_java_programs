interface It1
{
	int number1=10;		// by default it is public static final
}

// Assignment 1
class Example26 implements It1
{
	static void method()
	{
		System.out.println("Inside the Method and value of number is : "+number1);
		//number1=20;		by default it is public static final so can not change the value of number1
		//System.out.println("Inside the Method and value of number is : "+number1);
	}
	
	public static void main(String[] args)
	{
		method();
	}
}