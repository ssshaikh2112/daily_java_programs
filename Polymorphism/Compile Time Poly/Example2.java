class Example2
{

	/*
		To achieve method overloading the method name should 
		remain the same but  vary in no. of args	
	*/

	void method(float a)
	{
		System.out.println("These is the 0 args method - 1");
	}
	void method(int b)
	{
		System.out.println("These is the 1 args method - 2");
	}
	public static void main(String args[])
	{
		Example2 ref = new Example2();
		ref.method(40);
	}
}