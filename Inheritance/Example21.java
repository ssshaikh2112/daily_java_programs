class Demo1
{
	Demo1()
	{
		this(20);
		System.out.println("It is the 0 Constructor of Demo1 -- Demo1");
	}

	Demo1(int b)
	{
		System.out.println("It is the 1 Constructor of Demo1 -- Demo1");
	}
}
class Test1 extends Demo1
{
	Test1()
	{
		this(20);
		System.out.println("It is the 0 Constructor of Test1 -- Test1");
	}
	Test1(int a)
	{	
		super();
		System.out.println("It is the 1 Constructor of Test1 -- Test1");
	}
}
/*
	With the help of one object we can call multiple child constructor
	or parent constructor by this() or super()
*/
class Example21
{
	public static void main(String args[])
	{
		new Test1();
	}
}