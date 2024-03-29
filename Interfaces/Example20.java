interface Interface1
{
	void method1();
	void method2();		// Overrides the methods
}

interface Interface2
{
	void method2();		// Overrides the methods
	void method3();
}
class Example20 implements Interface1 , Interface2		// Multiple inheritance allowed by interface
{
	public void method1()
	{
		System.out.println("These is the method - 1");
	}
	public void method2()		// Overrides the methods
	{
		System.out.println("These is the method - 2");
	}
	public void method3()
	{
		System.out.println("These is the method - 3");
	}
	public static void main(String[] args)
	{
		Example20 obj = new Example20();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}