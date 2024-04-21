interface Parent
{
	void test1();
	void test2();
}


class Example22
{
	Parent pp = new Parent()		// Anonymous Class Syntax
									// Create object with body
	{
		public void test1()
		{
			System.out.println("These is the test - 1 method Inside Anonymous Class");
		}
		public void test2()
		{
			System.out.println("These is the test - 2 method Inside Anonymous Class");
		}	
	};
	public static void main(String[] args)
	{
		Example22 ref = new Example22();
		ref.pp.test1();				// access the anonymous class members
		ref.pp.test2();				// access the anonymous class members
	}
}