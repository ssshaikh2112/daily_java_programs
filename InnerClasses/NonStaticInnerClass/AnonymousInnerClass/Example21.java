abstract class Parent
{
	abstract void test1();
	abstract void test2();
}

class Child
{
	Parent pp = new Parent()		// Anonymous Class Syntax
									// Create object with body
	{
		void test1()
		{
			System.out.println("These is the test - 1 method Inside Anonymous Class");
		}
		void test2()
		{
			System.out.println("These is the test - 2 method Inside Anonymous Class");
		}	
	};
	
}

class Example21
{
	public static void main(String[] args)
	{
		Child ref = new Child();
		ref.pp.test1();				// access the anonymous class members
		ref.pp.test2();				// access the anonymous class members
	}
}