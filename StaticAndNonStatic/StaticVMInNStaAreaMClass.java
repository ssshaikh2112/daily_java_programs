class AnotherClass
{
	static float number=100.5f;
	static void myMethod()
	{
		System.out.println("Inside the static method and access by non static area and then main() in multiple classes...");
	}
}




/*

1. static variables ,  methods access by non static area in another area by below way
			1.class name

2. non static area  is access by below way
			1.object creation
*/




class StaticVMInNStaAreaMClass
{

	void nonStaticArea()
	{

		// by class name
		System.out.println(AnotherClass.number);
		AnotherClass.myMethod();
		
	}

	public static void main(String[] args)
	{
		StaticVMInNStaAreaMClass refVar = new StaticVMInNStaAreaMClass();
		refVar.nonStaticArea();
	}
}