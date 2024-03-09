// parent / super / base 
class A
{
	void m1()
	{
		System.out.println("It is the m1 method of class A -- A");
	}
}

// child / sub / derived
class B extends A
{
	void m1()
	{
		System.out.println("It is the m1 method of class B -- B");
	}
	void test()
	{
		System.out.println("Test method is called...");
		this.m1();				// super keyword is also used to call the methods.
		super.m1();				// super keyword is also used to call the methods.
	}
}

class Example14
{
	public static void main(String[] args)
	{
		A a= new A();
		a.m1();
		B b =new B();
		b.test();
	}
}