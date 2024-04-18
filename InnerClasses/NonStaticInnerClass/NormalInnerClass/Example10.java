class OuterClassA
{
	/* call the non static members in the Inner Class In non static area
		Inner Class also extends Outer Class based on which we can use super keyword.
	*/
	int number1 = 10;
	float number2 = 11.5f;
	class InnerClassB extends OuterClassA
	{
		int number1 = 100;
		float number2 = 200.5f;
		void method1(int number1 , float number2)
		{
			System.out.println("Inside Method - 1 of InnerClassB : ");
			System.out.println(number1+number2);
			System.out.println(this.number1+this.number2);
			System.out.println(super.number1+super.number2);	
		}
	}
}

class Example10
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