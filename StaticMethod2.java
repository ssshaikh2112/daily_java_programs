class StaticMethod2
{
	static void method1()
	{
		System.out.println("Inside method1");
	}

	static void method2()
	{
		System.out.println("Indise method2");
	}

	public static void main(String args[])
	{
		//acccess method by 3 ways 1. direct access 2. classname 3. object
		method1();					// direct access
		StaticMethod2.method2();	// classname access
	}
}