class Demo1
{
	Demo1()
	{
		System.out.println("This is the 0 args constructor Block - 1 - Demo1");
	}
	
/*
	Compiler by default create a constructor and also super() within it.
	So constructor first call then instance block is checked and executed and then continue
*/
}
class Test1 extends Demo1
{

	{
		System.out.println("This is the Instance Block - 1 - Test1");
	}

	
/*
	Every Constructor may be set super() when will execute the parent constructor
*/
}
class Example26
{
	public static void main(String args[])
	{
		new Test1();
	}
}