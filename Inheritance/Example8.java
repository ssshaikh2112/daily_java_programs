final class A	// By making class final we can avoid the inheritance
{
	void myMethod()
	{
		System.out.println("Can not be inherites these class and acces method...");
	}
}

class B
{
	void myTest()
	{
		System.out.println("Child Class Method...");
	}
}
class Example8
{
	public static void main(String args[])
	{
		B b=new B();
		b.myTest();
		//b.myMethod();
	}
}