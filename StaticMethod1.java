class StaticMethod1
{
	static void method1()
	{
		System.out.println("Inside the method1 , call by main method...");
	}

	public static void main(String args[])
	{
		System.out.println("Welcome... First enter in the main...");
		method1();
		System.out.println("Return from method1...");
	}
}