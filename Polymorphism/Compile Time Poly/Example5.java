class Example5
{
	// Constructor name should remain same but different no. of args

	Example5()
	{
		System.out.println("These is the 0 args Constructor -- 1");
	}

	Example5(int a)
	{
		System.out.println("These is the 1 args Constructor -- 2");
	}
	public static void main(String[] args)
	{
		Example5 var = new Example5(5);
	}
}