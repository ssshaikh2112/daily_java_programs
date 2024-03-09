class Nonvariables
{
	int number1 = 10;
	float number2 = 20.5f;

}
class NonvariablesAndMethod extends Nonvariables
{
	int number3 = 100;
	float number4 = 200.5f;

	void method(int number5 , float number6)
	{
		System.out.println(number5+number6);	//Addition of arguments number
		System.out.println(number3+number4);	//Addition of nonstatic variable within same class number
		System.out.println(number1+number2);	//Addition of nonstatic variable different class but inherited by these class number
	}
}
class Example12
{
	public static void main(String args[])
	{
		NonvariablesAndMethod obj1 = new NonvariablesAndMethod();
		obj1.method(1000,2000.5f);
	}
}