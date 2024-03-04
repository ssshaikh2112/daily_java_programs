class AnotherClass
{
	static char name='A';

	static void myMethod()
	{
		System.out.println("Static member in another class access by another class...");
	}
}

/*

Static variables , Static methods are declare and initialize in one class and accessed in another class

1.	by class name
2.	by object creation

*/

class StaticVMInStaticAreaInMClass
{
	public static void main(String args[])
	{
		// by class name
		System.out.println(AnotherClass.name);
		AnotherClass.myMethod();
		System.out.println();

		// by object creation
		AnotherClass refVar =new AnotherClass();
		System.out.println(refVar.name);
		refVar.myMethod();
	}
}