class Demo
{
	final void method()		// If method is made as final that it is not possible to override.
							// Parent method is must final.
							// ERROR
	{
		System.out.println("Inside the Demo class -- >>");
	}
}
class Sample extends Demo
{
	void method()			/* It will not matter if child is final or not but 
							   it definetely matter parent is final or not with respect to concept of overriding.
							*/
	{
		System.out.println("Inside the Sample class -- >>");
	}
}
class Example17
{
	public static void main(String[] args)
	{
		Sample ss = new Sample();
		ss.method();
	}
}