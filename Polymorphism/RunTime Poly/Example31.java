class ParentClass
{
	protected  void m1()	// possible to override if access level is in increasing level
	{
		System.out.println("Inside Private method -- M1 -- Parent");
	}
}

class ChildClass extends ParentClass
{
	public void m1()	// possible to override if access level is in increasing level
	{
		System.out.println("Inside Private method -- M1 -- Child");
	}
}

/*

	Increasing Order:
		1.Private
		2.default
		3.protected
		4.public

	Descrising Order:
		1.public
		2.protected
		3.default
		4.private
*/


class Example31
{
	public static void main(String[] args)
	{
		//Upcasting
		ParentClass pp = new ChildClass();
		pp.m1();	// child execute	Overriding and gives the preference to child
	}
}