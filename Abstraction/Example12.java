abstract class Demo
{
	int number;
	Demo()
	{
		// super() by default present
		System.out.println("The value of Number is : "+number);
		number=10;
	}
	abstract void method();
}
class Example12 extends Demo
{
	void method()
	{
		System.out.println("The value of Number is : "+number);
	}
	public static void main(String[] args)
	{
		// nameless object creation
		new Example12().method();
	}
}