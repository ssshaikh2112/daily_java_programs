class Demo
{
	Demo(int a)		// through an error 
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

			Whenever compiler add super() it is responsible to call the 0 arguments constructor only.
			Argument constructor are not called
		*/
		System.out.println("Constructor 0 argument of Test -- 2");
	}
}
class Example17
{
	public static void main(String args[])
	{
		 new Test();	// nameless object creation 
	}
}