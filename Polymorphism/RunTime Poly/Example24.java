class Parent
{
	void carkey()
	{
		System.out.println("Give me the Key of Car...");
	}
}

class Child extends Parent
{
	void bikekey()
	{
		System.out.println("Give me the Key of Bike...");
	}
}
class Example24
{
	public static void main(String[] args)
	{
		// Upcasting
		Parent pp=new Child();
		pp.carkey();
	}
}