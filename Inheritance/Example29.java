class Demo1
{
	// static block executes first in the top to bottom manner. Precedance is gives to parent class
	static
	{
		System.out.println("This is the Static Block - 1 - Demo1");	//1
	}

	{
		System.out.println("This is the Instance Block - 1 - Demo1");	//3
	}
	Demo1()
	{
		System.out.println("These is the 0 args constructor - Demo1");	// 4
	}

}
class Test1 extends Demo1
{
	static
	{
		System.out.println("This is the Static Block - 2 - Test1");		//2
	}

	{
		System.out.println("This is the Instance Block - 2 - Test1");	//5
	}
	Test1()
	{
		System.out.println("These is the 0 args constructor - Test1");	 //6
	}
}
// call default constructor and default super()
class Example29
{
	public static void main(String args[])
	{
		new Test1();
	}
}