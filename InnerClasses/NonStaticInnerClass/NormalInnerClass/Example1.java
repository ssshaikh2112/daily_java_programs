class OuterClassA
{
	int number1 = 100;
	class InnerClassB
	{
		int number2 = 200;
	}
}

/*
	The Outer Class members can access in the Inner class 
	But Inner Class members directly can not access in Outer class
*/

class Example1
{
	public static void main(String[] args)
	{
		// Outer Class
		OuterClassA ref1 = new OuterClassA();
		System.out.println(ref1.number1);

		// Inner Class
		OuterClassA.InnerClassB ref2= ref1.new InnerClassB();
		System.out.println(ref2.number2);
	}
}