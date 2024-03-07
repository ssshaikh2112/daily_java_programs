class CheckClass
{
	static int studID=25;
	int fees=50000;
	static void myMethod1()
	{
		System.out.println("These is the static myMethod method - 1");
	}

	void myMethod2()
	{
		System.out.println("These is the non static method - 2");
	}
}


class Assignment4
{
	{
		// check if can call static and non static methods AND access other class variables
		// --->>	YES can call static methods AND access other class variables BUT not call non static methods and variables.(Object creation and goes into stack overflow state)
		System.out.println("These is the non static / Instance block of class Assignment4");
		CheckClass.myMethod1();
		System.out.println("The roll number of student in CheckClass is : "+CheckClass.studID);
	}

	static
	{
		// check if can call static and non static methods AND access other class variables
		// --->> YES we can call static and non static methods AND access other class variables
		
		System.out.println("These is the static block of class Assignment4");
		CheckClass.myMethod1();
		System.out.println("The roll number of student in CheckClass is : "+CheckClass.studID);
		CheckClass obj1 = new CheckClass();
		obj1.myMethod2();
		System.out.println("The fees of student in CheckClass is : "+obj1.fees);
	}
	public static void main(String[] args)
	{
		System.out.println("These is the MAIN area");
		Assignment4 obj2 = new Assignment4();
	}
}