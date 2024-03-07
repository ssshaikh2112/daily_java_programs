class Assignment3
{

	{
		// check if we can call static and non static methods	--> YES We can call static methods but Can not call non static methods
		System.out.println("These is the non static / instance block");

		myMethod1();
		//Assignment3 obj3 = new Assignment3();
		//obj3.myMethod2();
	}
	
	static
	{
		// check if we can call static and non static methods	--> YES
		System.out.println("These is the static block");
		myMethod1();
		Assignment3 obj2 = new Assignment3();
		obj2.myMethod2();
	}


		static void myMethod1()
	{
		System.out.println("These is the static myMethod method - 1");
	}

	void myMethod2()
	{
		System.out.println("These is the non static method - 2");
	}


	public static void main(String[] args)
	{
		System.out.println("These is the main block");
		Assignment3 obj1 = new Assignment3();
	}
}