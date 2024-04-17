class OuterClassA
{
	// call the non static members in the Inner Class In non static area
	int number1 = 10;
	float number2 = 11.5f;
	class InnerClassB
	{
		int number3 = 100;
		float number4 = 200.5f;
		void method1(int number5 , float number6)
		{
			System.out.println("Inside Method - 1 of InnerClassB : ");
			System.out.println(number5+number6);
			System.out.println(number3+number4);
			System.out.println(number1+number2);
		}
	}
}

class Example7
{
	public static void main(String[] args)
	{
		/*
		OuterClassA ref1 = new OuterClassA();
		OuterClassA.InnerClassB ref2 = ref1.new InnerClassB();
		ref2..method1(1000 , 2000.5f);
		*/

		new OuterClassA().new InnerClassB().method1(1000 , 2000.5f);
	}
}