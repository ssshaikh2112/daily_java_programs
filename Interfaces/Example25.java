class Demo
{
	interface It3
	{
		void method();		// Inner interface is allow
							// Interface within the class is allow
	}
}

class Example25	implements Demo.It3	// Access  of inner interface
{
	public void method()
	{
		System.out.println("Inside method...");
	}
	public static void main(String[] args)
	{
		Example25 obj = new Example25();
		obj.method();
	}
}