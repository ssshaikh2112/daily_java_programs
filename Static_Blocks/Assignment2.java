class Assignment2
{
	{
		// check we can create object	--> NO
		System.out.println("These is the non static block...");
		//Assignment2 obj2 = new Assignment2();

	}
	static
	{
		//check we can create object	--> YES
		System.out.println("These is the static block...");
		Assignment2 obj3 = new Assignment2();

	}
	public static void main(String[] args)
	{
		System.out.println("These is the main area...");
		Assignment2 obj1 = new Assignment2();
	}
}