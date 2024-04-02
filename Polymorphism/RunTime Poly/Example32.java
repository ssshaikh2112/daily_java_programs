class ParentClass
{
	public void m1()	// it is not possible to override if access level is in Descresing level
	{
		System.out.println("Inside Private method -- M1 -- Parent");
	}
}

class ChildClass extends ParentClass
{
	protected void m1()	//it is notpossible to override if access level is in Descresing level
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


class Example32
{
	public static void main(String[] args)
	{
		//Upcasting
		ParentClass pp = new ChildClass();
		pp.m1();	// error
	}
}