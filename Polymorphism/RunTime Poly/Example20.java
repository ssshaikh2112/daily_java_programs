class ParentClass
{
	int number1=10;
	void method1()
	{
		System.out.println("The value of number- 1 is in the Parent class is : "+number1);
	}
}
class ChildClass extends ParentClass
{
	float number2=110.5f;
	void method2()
	{
		System.out.println("The value of number- 2 is in the Parent class is : "+number2);
	}
}
class Example20
{
	/*
		Child Object is behaving as parent is called Upcasting.

		Whenever child behave as parent it will loss characteristicks of
		child and accquire characteristicks of parents.

		Child behave as parent then also behave as child then process is called DownCasting

	*/
	public static void main(String[] args)
	{
		// Upcasting
		ParentClass obj1=new ChildClass();
		obj1.method1();
		//obj1.method2();				Error Not possible
		System.out.println("------------------------------------------------------");

		// DownCasting
		ChildClass obj2 = (ChildClass)obj1;
		obj2.method1();
		obj2.method2();
	}
}