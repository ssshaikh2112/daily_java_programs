abstract class Demo1
{
	abstract void method1();
	abstract void method2();
	abstract void method3();
}

class Example4 extends Demo1
{
	void method1()
	{
		System.out.println("These is the method -- 1");
	}

	void method2()
	{
		System.out.println("These is the method -- 2");
	}
	/*
	
		If in child class all the abstract methods are not implements 
		or one of them is also not implemented then child class by nature will be abstract class.
		And it throw an error 
		"Example4 is not abstract and does not override abstract method method3() in Demo1"
	
	*/
	public static void main(String[] args)
	{
		Example4 ref = new Example4();
		ref.method1();
	}
}