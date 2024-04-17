class OuterClassA
{
	int number1 = 10;
	void method1()
	{

		/*
			We can not access the members of inner class in outer class.
			For these we need to create an Object.
		*/
		InnerClassB ref = new InnerClassB();
		System.out.println(number1+ref.number2);
	}
	class InnerClassB
	{
		float number2 = 11.5f;
	}
}



class Example4
{
	public static void main(String[] args)
	{
		//OuterClassA ref = new OuterClassA();
		// ref.method1();
		new OuterClassA().method1();
	}
}