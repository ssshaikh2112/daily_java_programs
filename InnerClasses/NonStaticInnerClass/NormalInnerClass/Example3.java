class OuterClassA
{
	int number1 = 10;
	class InnerClassB
	{
		float number2 = 12.5f;
		void method1()
		{
			System.out.println(number1+number2);
		}
	}
}



class Example3
{
	public static void main(String[] args)
	{
		// Normal Way object creation
		OuterClassA ref1 = new OuterClassA();
		OuterClassA.InnerClassB ref2 = ref1.new InnerClassB();
		ref2.method1();

		//  Standard object creation
		new OuterClassA().new InnerClassB().method1();
	}
}