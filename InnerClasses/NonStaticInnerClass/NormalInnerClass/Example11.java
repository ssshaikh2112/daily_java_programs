class OuterClassA
{
	/*
		Private access modifier is not apllicable for single class level 
		But when in Inner Class it applicable at class level.

		Q. Can we make class as private?
		ANS : Yes , Normal class can not be private but Inner Class can be private.
	*/
	void method2()
	{
		InnerClassB ref2 = new InnerClassB();
		ref2.method1();
	}
	private class InnerClassB 
	{
		private int number1 = 100;
		private float number2 = 200.5f;
		void method1()
		{
			System.out.println("Inside Method - 1 of InnerClassB : ");
			System.out.println(number1+number2);
			
		}
	}
}

class Example11
{
	public static void main(String[] args)
	{
		
		OuterClassA ref1 = new OuterClassA();
		ref1.method2();
		
	}
}