class Parent
{
	void carkey()		// Method Names are same "Overriding"
	{
		System.out.println("Give me the Key of Car...");
	}
}

class Child extends Parent
{
	void carkey()		// Method Names are same "Overriding"
	{
		System.out.println("Give me the Key of Bike...");
	}
}

/*
	It is possible to override non static methods as they are bounded 
	by objects.		However it is not possible to override static members
	and they are bound by classes.
*/

class Example25
{
	public static void main(String[] args)
	{
		// Upcasting
		Parent pp=new Child();
		pp.carkey();	// Gives the preference to child class
	}
}