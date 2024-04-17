class OuterClassA
{
	int number1 = 10;
	void method1()
	{
		System.out.println("Inside Method - 1 of OuterClassA : "+number1);
	}
	class InnerClassB
	{
		// Non static members access in non static area
		float number2 = 11.5f;
		void method2()
		{
			System.out.println("Inside Method - 2 of InnerClassB : "+number2);
			method1();
		}
	}
}

class Example5
{
	public static void main(String[] args)
	{
		/*
		OuterClassA ref1 = new OuterClassA();
		OuterClassA.InnerClassB ref2 = ref1.new InnerClassB();
		ref2.method2();
		*/

		new OuterClassA().new InnerClassB().method2();
	}
}