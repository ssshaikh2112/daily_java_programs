class Example2
{
	/*
		Static blocks are executed during class loading time...
		Static blocks are executed first then main().

		We create multiple  static blocks & EXECUTION order is top to bottom
	*/

	static
	{
		System.out.println("These is static block - 1");
	}

	static
	{
		System.out.println("These is static block - 2");
	}
	public static void main(String[] args)
	{
		System.out.println("These is Main block...");	}
}