class Papa
{
	int method()
	{
		System.out.println("These is the method inside the --- Papa");
		return 100;		//It is NOT possible to override if parent method and child method return type are different at primitive level
		// ERROR
	}
}
//It is not possible to override if parent methid and child method return type are same at primitive level
class Beta extends Papa
{
	float method()
	{
		System.out.println("These is the method inside the --- Beta");
		return 200.5f;		//It is NOT possible to override if parent methid and child method return type are different at primitive level
		// ERROR
	}
}

/*
	Overrinding is the process where child and Parent has same objective , 
	the child will inherites the parent objective but will change  the behavior is called Overriding.

	1.	Minimus we require two classes
	2.	There should be is a relationship between both classes.
	3.	The parent class method signature and child class method signature should same
*/

class Example14
{
	public static void main(String[] args)
	{
		Beta b  = new Beta();
		b.method();
	}
}