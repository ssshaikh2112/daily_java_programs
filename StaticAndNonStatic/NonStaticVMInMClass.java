class AnotherClass
{
	int number = 11;
	void myMethod()
	{
		System.out.println("Inside the non Static method and declare/intialize in one class and access by another class...");
	}
}


class NonStaticVMInMClass
{
/*

Non static variables , methods are access in static area in Multiple class
1. object creation (Only one way to acces)

*/

	public static void main(String[] args)
	{
		AnotherClass refVar = new AnotherClass();
		System.out.println(refVar.number);
		refVar.myMethod();

	}
}