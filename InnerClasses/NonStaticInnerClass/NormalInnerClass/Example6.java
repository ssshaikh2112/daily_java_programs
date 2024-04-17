class OuterClassA
{
	// Private members of Outer class can be Access in Inner class.
	private int number1 = 10;
	private float number2 = 11.5f;
	class InnerClassB
	{	
		void method1()
		{
			System.out.println("Inside Method - 1 of InnerClassB : ");
			System.out.println(number1+number2);
		}
	}
}

class Example6
{
	public static void main(String[] args)
	{
		/*
		OuterClassA ref1 = new OuterClassA();
		OuterClassA.InnerClassB ref2 = ref1.new InnerClassB();
		ref2.method1();
		*/

		new OuterClassA().new InnerClassB().method1();
	}
}