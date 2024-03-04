class StaticVMInStaticAreaInSClass
{
	/*
		In the same class static variables , methods are accessed by 3 ways
		but object creation is not prefered in the same class.
	*/
	static int number=10;

	static void myMethod()
	{
		System.out.println("Inside the static myMethod...");
	}
	public static void main(String[] args)
	{
		// directlly way
		System.out.println(number);
		myMethod();

		System.out.println();

		// by class name
		System.out.println(StaticVMInStaticAreaInSClass.number);
		StaticVMInStaticAreaInSClass.myMethod();

		System.out.println();

		// by object creation	but not prefered
		StaticVMInStaticAreaInSClass referencevar=new StaticVMInStaticAreaInSClass();
		System.out.println(referencevar.number);
		referencevar.myMethod();
	}
}