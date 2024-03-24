abstract class Demo1
{
	int number;
	{
		System.out.println("These is the instance block "+number);
		number= 100;
	}
	Demo1()
	{
		// super() by default present
		System.out.println("The value of Number is : "+number);
		number=10;
	}
	void method()
	{
		System.out.println("Method And value is : "+number);
	}
}
class Example13 extends Demo1
{
	
	public static void main(String[] args)
	{
		// nameless object creation
		new Example13().method();
	}
}