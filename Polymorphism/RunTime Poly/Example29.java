class ParentClass
{
	private void m1()		// Private members are not part of overring
	{
		System.out.println("Inside Private method -- M1 -- Parent");
	}
}

class ChildClass extends ParentClass
{
	void m1()
	{
		System.out.println("Inside Private method -- M1 -- Child");
	}
}
class Example29
{
	public static void main(String[] args)
	{
		ParentClass pp = new ChildClass();
		pp.m1();
	}
}