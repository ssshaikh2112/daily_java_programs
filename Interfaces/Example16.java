interface TestClass
{
	void m1();			//If method declare inside the interfacethen by default is public as well as abstract by nature
	void m2();			
}

class Example16 implements TestClass
{
	public void m1()
	{
		System.out.println("These is the Method -- 1");
	}
	public void m2()
	{
		System.out.println("These is the Method -- 2");
	}
	public static void main(String[] args)
	{
		// Normal Object Creation
		Example16 obj = new Example16();
		obj.m1();
		obj.m2();
		
		System.out.println("--------------------------");

		// Upcasting
		TestClass obj2=new Example16();
		obj2.m1();
		obj2.m2();

		/*
			We can not create object of interface however we can defenetely store
			the address of object within reference variable and that reference variable 
			can either be a type of abstract class or it can be a type of interface
		*/
	}
}