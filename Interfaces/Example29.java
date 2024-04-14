interface It1
{
	/*
		Default is created here saparate for interface it is not a access modifier and it behave as public by nature.

		To create complete non static method within in interface we have prefix keyword i.e default.

		The default keyword in interface by complete and JVM that it allow to create complete non static method in interface

		The nature of these method will public
	*/
	default void method()
	{
		System.out.println("Inside the method of Interface");
	}
}

class Example29 implements It1		//default methods is in interface are  allow to be inherited.
{
	public static void main(String[] args)
	{
		Example29 obj = new Example29();
		obj.method();
	}
}