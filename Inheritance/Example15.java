class Demo
{
	Demo()
	{
		System.out.println("Constructor 0 argument of Demo -- 1");
	}
}

class Test extends Demo
{
	Test()
	{
		super();		/*	the super() [statement or method] is used to call
							another constructor within the super class (Another class).
						*/
		System.out.println("Constructor 0 argument of Test -- 2");
	}
}
class Example15
{
	public static void main(String args[])
	{
		Test tt = new Test();
	}
}