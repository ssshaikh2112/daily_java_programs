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
		/*	the super() [statement or method] is used to call
			another constructor within the super class (Another class).

			If we do not add the super() then compiler add it automatically while compiling 
		*/
		System.out.println("Constructor 0 argument of Test -- 2");
	}
}
class Example16
{
	public static void main(String args[])
	{
		 new Test();	// nameless object creation 
	}
}