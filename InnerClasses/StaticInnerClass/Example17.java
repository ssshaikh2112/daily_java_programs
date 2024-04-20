class OuterClassA
{
	/*
		Static Inner Class only allow static  member to be 
		access to outer class members in inner class
	*/
	int number1 = 100;
	static float number2 = 200.5f;
	static class InnerClassB
	{
		static void m1()
		{
			OuterClassA ref2 = new OuterClassA();
			System.out.println(number2);
			System.out.println(ref2.number1);
		}
	}
}

class Example17
{
	public static void main(String[] args)
	{
		OuterClassA.InnerClassB.m1();
	}
}