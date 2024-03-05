class Example1
{
	/*
		Non static blocks are executed while object creation.
	*/
	{
		System.out.println("Its non static block...");
	}
	public static void main(String[] args)
	{
		Example1 obj=new Example1();
	}
}