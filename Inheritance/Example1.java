class Test
{
	int number1 = 10;
}

class Example1 extends Test
{
	// extends keyword is used for the inherites the members of another class members
	float number2=12.5f;
	public static void main(String[] args)
	{
		// Access only the Test class members
		Test obj1 = new Test();
		System.out.println("----------Parent class----------");
		System.out.println("The value of number - 1 is : "+obj1.number1);
		//System.out.println("The value of number - 1 is : "+obj1.number2);

		// Access both class members (Example1 class is child of Test class)
		Example1 obj2 = new Example1();
		System.out.println("----------Child  class----------");
		System.out.println("The value of number - 1 is : "+obj2.number1);
		System.out.println("The value of number - 1 is : "+obj2.number2);
	}
}