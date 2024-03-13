class Demo1
{
	// static block executes first in the top to bottom manner. Precedance is gives to parent class
	static
	{
		System.out.println("This is the Static Block - 1 - Demo1");
	}
	// call default constructor and default super()
}
class Test1 extends Demo1
{
	static
	{
		System.out.println("This is the Static Block - 1 - Test1");
	}
}
// call default constructor and default super()
class Example27
{
	public static void main(String args[])
	{
		new Test1();
	}
}