class Demo1
{
	int number1=10;
	void method1()
	{
		System.out.println("Inside Method - 1 and number 1 is : "+number1);
	}
}
class Demo2 extends Demo1
{
	int number2=20;
	void method2()
	{
		System.out.println("Inside Method - 2 and number 2 is : "+number2);
	}
}
class Test
{
	void method3(Demo1 d1)		//Upcasting
	{
		d1.method1();
		//d1.method2();			Error
		Demo2 d2 =(Demo2)d1;	//Downcasting
		System.out.println();
		d2.method1();
		d2.method2();

	}
}
class Example21
{
	public static void main(String[] args)
	{
		Test ref = new Test();
		ref.method3(new Demo2());	//create object of Demo2 class Upcasting
	}
}