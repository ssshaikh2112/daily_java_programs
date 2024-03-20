class Example1
{

	/*
		To achieve method overloading the method name should 
		remain the same but  vary in no. of args	
	*/

	void method()
	{
		System.out.println("These is the 0 args method - 1");
	}
	void method(int a)
	{
		System.out.println("These is the 1 args method - 2");
	}
	public static void main(String args[])
	{
		Example1 ref = new Example1();
		ref.method(4);
	}
}