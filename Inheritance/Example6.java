// Multiple Inheritance
//

class A2
{
	void m1()
	{
		System.out.println("Method m1");
	}
}
class B2
{
		System.out.println("Method m1");
}
class C2 extends A2 , B2	// saparated by coma is not supported by java
							// Only one CLASS can single java class extends or inherites
{
		System.out.println("Child class");
}
class Example6
{
	public static void main(String args[])
	{
		System.out.println("Multiple inheritance does not support by java...");
	}
}