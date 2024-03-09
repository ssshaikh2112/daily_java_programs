class A	
{
	void myMethod()
	{
		System.out.println("Can not be inherites these class and acces method...");
	}
}

final class B extends A		// if child class make final there is no effect on the inheritance
{
	void myTest()
	{
		System.out.println("Child Class Method...");
	}
}
class Example9
{
	public static void main(String args[])
	{
		B b=new B();
		b.myTest();
		b.myMethod();

	}
}