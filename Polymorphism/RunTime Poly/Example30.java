class ParentClass
{
	protected void m1()	// possible to override if access level is at same 
	{
		System.out.println("Inside Private method -- M1 -- Parent");
	}
}

class ChildClass extends ParentClass
{
	protected void m1()	// possible to override if access level is at same 
	{
		System.out.println("Inside Private method -- M1 -- Child");
	}
}
class Example30
{
	public static void main(String[] args)
	{
		//Upcasting
		ParentClass pp = new ChildClass();
		pp.m1();	// child execute	Overriding and gives the preference to child
	}
}