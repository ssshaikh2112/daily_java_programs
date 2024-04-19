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
		void m1()
		{
			System.out.println(number2);
			//System.out.println(number1);	Compilation Error
		}
	}
}

class Example15
{
	public static void main(String[] args)
	{
		OuterClassA.InnerClassB ref = new OuterClassA.InnerClassB();
		ref.m1();
	}
}