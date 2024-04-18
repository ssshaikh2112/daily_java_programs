class OuterClassA
{

	/*	call the non static members in the Inner Class In non static area
		this keyword always pount to Inner Class object , 
		whenever inner Class object is create it create Outer class object 
	*/

	int number1 = 10;								//OuterClassA.this.number1
	float number2 = 11.5f;							//OuterClassA.this.number2
	class InnerClassB
	{
		int number1 = 100;							//this.number1
		float number2 = 200.5f;						//this.number2

		void method1(int number1 , float number2)
		{
			System.out.println("Inside Method - 1 of InnerClassB : ");
			System.out.println(number1+number2);
			System.out.println(this.number1+this.number2);
			System.out.println(OuterClassA.this.number1+OuterClassA.this.number2);		// className.this.variable
		}
	}
}

class Example8
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