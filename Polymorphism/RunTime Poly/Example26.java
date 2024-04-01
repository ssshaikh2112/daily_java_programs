class Parent
{
	static void carkey()		// Method Names are same "Overriding"
	{
		System.out.println("Give me the Key of Car...");
	}
}

class Child extends Parent
{
	static void carkey()		// Method Names are same "Overriding"
	{
		System.out.println("Give me the Key of Bike...");
	}
}

/*
	This is also called method hidden as child method get hidden because by 
	nature the method gives same and static by nature and method name remain same.
*/

class Example26
{
	public static void main(String[] args)
	{
		// Upcasting
		Parent pp=new Child();
		pp.carkey();	// Gives the preference to parent class
	}
}