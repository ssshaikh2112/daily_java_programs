class Demo1
{
	Demo1()
	{
		System.out.println("It is the 0 Constructor of Demo1 -- Demo1");
	}
}
class Test1 extends Demo1
{
	Test1()
	{
		System.out.println("It is the 0 Constructor of Test1 -- Test1");
	}
	Test1(int a)
	{
		System.out.println("It is the 1 Constructor of Test1 -- Test1");
	}
}

class Example18
{
	public static void main(String args[])
	{
		new Test1();
		new Test1(10);
	}
}