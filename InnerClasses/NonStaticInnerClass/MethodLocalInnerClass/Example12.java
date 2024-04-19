class OuterClassA
{
	void m1()
	{
		class InnerClassB
		{

			int number1=100;
		}
		InnerClassB ref1 = new InnerClassB();
		System.out.println(ref1.number1);
	}
}

/*
	A class declare within Method is called Method Local Inner Class

	Once method is active (Within Stack) only then it is possible to declare 
	the class as well as we can create an object.

	Once method is inactive (out of stack) then the respective object is eligible for distruction.

*/

class Example12
{
	public static void main(String[] args)
	{
	
		OuterClassA ref2 = new OuterClassA();
		ref2.m1();
	}
}