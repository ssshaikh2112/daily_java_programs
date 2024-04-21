abstract class Parent
{
	abstract void test1();
	abstract void test2();
}

class Child extends Parent
{
	void test1()
	{
		System.out.println("These is the test - 1 method...");
	}
	void test2()
	{
		System.out.println("These is the test - 2 method...");
	}
}

class Example20
{
	public static void main(String[] args)
	{
		Child ref = new Child();
		ref.test1();
		ref.test2();
	}
}