interface It2
{
	interface It3
	{
		void method();		// Inner interface is allow
							// Interface within the interface is called inner interface
	}
}

class Example24	implements It2.It3	// Access  of inner interface
{
	public void method()
	{
		System.out.println("Inside method...");
	}
	public static void main(String[] args)
	{
		Example24 obj = new Example24();
		obj.method();
	}
}