//Single Level Inheritance

// Bussiness Logic
class A
{
	void method1()
	{
		System.out.println("I'm Parent class...");
	}
}

class B extends A
{
	void method2()
	{
		System.out.println("I'm Child class of A ...");
	}
}

class C extends B
{
	void method3()
	{
		System.out.println("I'm Child class of B ...");
	}
}

//Controller Class
class Example3
{
	public static void main(String[] args)
	{
		// Access only the A class members
		A obj1 = new A();
		obj1.method1();
		System.out.println("--------------------");

		// Access both class members (B class is child of A class And Example2 is the Controller Class )
		B obj2 = new B();
		obj2.method1();
		obj2.method2();

		System.out.println("--------------------");
		C obj3 = new C();
		obj3.method1();
		obj3.method2();
		obj3.method3();
	}
}