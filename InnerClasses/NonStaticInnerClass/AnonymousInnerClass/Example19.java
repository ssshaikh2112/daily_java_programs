class Example19
{
	/*
		These is the type of Non Static Inner class 

		It is called as nameless class.

		Nameless classes means we do not give name but compiler give name is called Anonymous Class
	*/
	
	static boolean status=true;
	static void m1()
	{
		System.out.println("Inside m-1 method..."+status);
	}
	static class Test
	{
		static void method1()
		{
			System.out.println("Inside method-1 of Test Class");
			m1();
		}
		void method2()
		{
			System.out.println("Inside method-2 of Test Class");
			m1();
		}
	}
	public static void main(String[] args)
	{
		Example19.Test.method1();
		new Example19.Test().method2();		// OR new Test().method2();
	}
}