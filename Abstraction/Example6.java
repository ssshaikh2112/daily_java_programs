abstract class Test2
{
	/*
		Abstract class are not 100% abstract because they allow both complete 
		and incomplete methods within abstract class
	*/
	abstract void method1();
	void method2()
	{
		System.out.println("These is the method -- 2");
	}
}

class Example6 extends Test2
{
	void method1()
	{
		System.out.println("These is the method -- 1");
	}
	void method3()
	{
		System.out.println("These is the method -- 3");
	}
	public static void main(String[] args)
	{
		// Normal Object creation
		Example6 ref1 = new Example6();
		ref1.method1();
		ref1.method2();
		ref1.method3();

		// Upcasting
		Test2 ref2=new Example6();		
		ref2.method1();
		ref2.method2();
		ref2.method3();	// error because by call upcast call go to parent class and these method is in the child class.
		
		
	}
}