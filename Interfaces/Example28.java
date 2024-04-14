interface It1
{
	/*
		Java 8 allow to create complete method is in the interface
		Hence within interface we can create both static and non static complete methods.

		Static methods is in interface are not allow to be inherited.
	*/
	static void method()
	{
		System.out.println("Inside the method of Interface");
	}
}

class Example28 //implements It1		Static methods is in interface are not allow to be inherited.
{
	public static void main(String[] args)
	{
		It1.method();
	}
}