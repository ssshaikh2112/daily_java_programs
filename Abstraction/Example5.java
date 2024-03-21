abstract class Demo1
{
	abstract void method1();
	abstract void method2();
	abstract void method3();
}

class Example5 extends Demo1
{
	void method1()
	{
		System.out.println("These is the method -- 1");
	}

	void method2()
	{
		System.out.println("These is the method -- 2");
	}
	void method3()
	{
		System.out.println("These is the method -- 3");
	}

	/*
		To make child class is a normal class we must to implements the all 
		abstract method within it. Otherwise child class it by nature abstract class.
	*/

	public static void main(String[] args)
	{
		Example5 ref = new Example5();
		ref.method1();
		ref.method2();
		ref.method3();
	}
}