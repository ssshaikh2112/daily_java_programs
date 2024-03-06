class Example1
{
	/*
		Static blocks are executed during class loading time...
		Static blocks are executed first then main().
	*/

	static
	{
		System.out.println("These is static block...");
	}
	public static void main(String[] args)
	{
		System.out.println("These is Main block...");	}
}