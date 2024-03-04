class NonStaticVMInSClass
{
	int number = 11;
	void myMethod()
	{
		System.out.println("Inside the non Static method...");
	}

/*

Non static variables , methods are access in static area in single class
1. object creation (Only one way to acces)

*/

	public static void main(String[] args)
	{
		NonStaticVMInSClass refVar = new NonStaticVMInSClass();
		System.out.println(refVar.number);
		refVar.myMethod();

	}
}