class Example7
{
	// Constructor name should remain same but different no. of args

	Example7(float a)
	{
		System.out.println("These is the 1 args Constructor typr float -- 1");
	}

	Example7(int a)
	{
		System.out.println("These is the 1 args Constructor type int -- 2");
	}
	Example7(int a , float b)
	{
		System.out.println("These is the 1 args Constructor type int and float -- 3");
	}
	public static void main(String[] args)
	{
		Example7 var = new Example7(4 , 5f);
	}
}