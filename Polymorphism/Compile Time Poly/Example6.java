class Example6
{
	// Constructor name should remain same but different no. of args

	Example6(float a)
	{
		System.out.println("These is the 1 args Constructor typr float -- 1");
	}

	Example6(int a)
	{
		System.out.println("These is the 1 args Constructor type int -- 2");
	}
	public static void main(String[] args)
	{
		Example6 var = new Example6(5f);
	}
}