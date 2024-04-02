class Parent
{
	void carKey()		
	{
		System.out.println("Give me the Key of Car -- Parent");
	}
	void homeKey()
	{
		System.out.println("Give me Home Key -- Parent");
	}
}

class Child extends Parent
{
	void bikeKey()		
	{
		System.out.println("Give me the Key of Bike -- Child");
	}
	
	void homeKey()
	{
		System.out.println("Give me Home Key -- Child");
	}
}



class Example28
{
	public static void main(String[] args)
	{
		Parent pp = new Child();
		pp.carKey();
		pp.homeKey();		// Give preference to child class	Overrinding
		System.out.println("-----------------------------------");
		Child cc= new Child();
		cc.carKey();
		cc.homeKey();		// Give preference to child class    Overrinding
		cc.bikeKey();
	}
}