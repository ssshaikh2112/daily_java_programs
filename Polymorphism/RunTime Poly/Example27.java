class Parent
{
	void m1()		// Method Names are same "Overriding"	Then it gives the peference to child while calling method
	{
		System.out.println("These is the M1 Method -- Parent");
	}
	void m2()
	{
		System.out.println("These is the M2 Method -- Parent");
	}
}

class Child extends Parent
{
	void m1()	// Method Names are same "Overriding"	Then it gives the peference to child while calling method
	{
		System.out.println("These is the M1 Method -- Child");
	}
	void m3()
	{
		System.out.println("These is the M3 Method -- Child");
	}
}


class Example27
{
	public static void main(String[] args)
	{
		// Upcasting
		Parent pp=new Child();
		pp.m1();	// Child method Execute		Overriding
		pp.m2();
		System.out.println("--------------------------------");
		// Downcasting
		Child cc = (Child)pp;
		cc.m1();	// Child method Execute		Overriding
		cc.m2();
		cc.m3();
	}
}