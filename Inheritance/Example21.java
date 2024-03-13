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

/*
	Constructor are never part of inheritance , because if parent constructor inherite
	within the child it will voiled the rule number i.e Constructor name must be same as the class name
	To avoid these super() is send the control to parent class (super class) and parent constructor will executed
*/

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
