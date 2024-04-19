class OuterClassA
{
	// we can create multiple Method Local Inner Class within same class
	void m1()
	{
		class InnerClassB1
		{
			int number1=100;
			void method1()
			{
				System.out.println(number1);
			}
		}
		InnerClassB1 ref1 = new InnerClassB1();
		ref1.method1();
	}


	void m2()
	{
		class InnerClassB2
		{
			int number2=200;
			void method2()
			{
				System.out.println(number2);
			}
		}
		InnerClassB2 ref2 = new InnerClassB2();
		ref2.method2();
	}
}

/*
	A class declare within Method is called Method Local Inner Class

	Once method is active (Within Stack) only then it is possible to declare 
	the class as well as we can create an object.

	Once method is inactive (out of stack) then the respective object is eligible for distruction.

*/

class Example13
{
	public static void main(String[] args)
	{
	
		OuterClassA ref3 = new OuterClassA();
		ref3.m1();
		ref3.m2();

	}
}