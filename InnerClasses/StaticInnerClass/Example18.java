class OuterClassA
{
	/*
		Static Inner Class only allow static  member to be 
		access to outer class members in inner class
	*/

	int number1 = 100;
	static float number2 = 200.5f;

	void m2()
	{
		new InnerClassB().m1();
	}
	static class InnerClassB
	{
		void m1()
		{
			OuterClassA ref2 = new OuterClassA();
			System.out.println(number2);
			System.out.println(ref2.number1);
			System.out.println(ref2.number1+number2);

		}
	}
}

class Example18
{
	public static void main(String[] args)
	{
		OuterClassA ref3 = new OuterClassA();
		ref3.m2();
	}
}