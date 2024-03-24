abstract class Demo2
{
	int number;
	static
	{
		System.out.println("These is the Static block ");
		
	}
	{
		System.out.println("These is the instance block "+number);
		number= 100;
	}
	Demo2()
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
class Example14 extends Demo2
{
	
	public static void main(String[] args)
	{
		// nameless object creation
		new Example14().method();
	}
}

/*
Sequence of execution:

static
non static
constructor
methiod
.
.
.
*/