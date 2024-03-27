class Papa
{
	void method()
	{
		System.out.println("These is the method inside the --- Papa");
	}
}

class Beta extends Papa
{
	void method(int money)
	{
		System.out.println("These is the method inside the --- Beta");
	}
}

/*
	Overrinding is the process where child and Parent has same objective , 
	the child will inherites the parent objective but will change  the behavior is called Overriding.

	1.	Minimus we require two classes
	2.	There should be is a relationship between both classes.
	3.	The parent class method signature and child class method signature should same
*/

class Example12
{
	public static void main(String[] args)
	{
		Beta b  = new Beta();
		b.method(1000);
	}
}