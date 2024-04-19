class OuterClassA
{
	/*
		Normal Inner Class allow both static and non static member to be 
		access to outer class members in inner class
	*/
	int number1 = 100;
	static float number2 = 200.5f;
	class InnerClassB
	{
		void m1()
		{
			System.out.println(number1+number2);
		}
	}
}

class Example14
{
	public static void main(String[] args)
	{
		new OuterClassA().new InnerClassB().m1();
	}
}