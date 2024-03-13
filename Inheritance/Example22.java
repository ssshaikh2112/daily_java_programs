class Demo1
{
	{
		System.out.println("This is the Instance Block - 1 - Demo1");
	}
	Demo1()
	{
		// first Instance block Execute
		// every Constructor may be set super() when will execute the parent constructor And it send the control to the same type of constructor.
		// Argument object send control to argument constructor 
		// 0 Argument object send control to 0 argument constructor 

		// super();
		System.out.println("It is the 0 Constructor of Demo1 -- Demo1");
	}


}
class Test1 extends Demo1
{
	{
		System.out.println("This is the Instance Block - 2 - Test1");
	}
	Test1()
	{
		super();
		// first Instance block Execute
		// very Constructor may be set super() when will execute the parent constructor And it send the control to the same type of constructor.
		// Argument object send control to argument constructor 
		// 0 Argument object send control to 0 argument constructor
		
		System.out.println("It is the 0 Constructor of Test1 -- Test1");
	}
}

/*
	Every Constructor may be set super() when will execute the parent constructor
*/
class Example22
{
	public static void main(String args[])
	{
		new Test1();
	}
}