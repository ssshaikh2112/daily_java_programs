// parent / super / base 
class Nonvariables
{
	int number1 = 10;
	float number2 = 20.5f;

}

// child / sub / derived
class NonvariablesAndMethod extends Nonvariables
{
	int number1 = 100;
	float number2 = 200.5f;

	void method(int number1 , float number2)
	{
		System.out.println(number1+number2);					//Addition of arguments number
		System.out.println(this.number1+this.number2);			//Addition of nonstatic variable within same class number
																//	this keyword store the current class object address

		System.out.println(super.number1+super.number2);		//Addition of nonstatic variable different class but inherited by these class number
																// super keyword used access the super class members
	}
}

/*
	To differentiate between the instance member of child class and instance member of parent class
	where variables names are same then use the super keyword
*/

class Example13
{
	public static void main(String args[])
	{
		NonvariablesAndMethod obj1 = new NonvariablesAndMethod();
		obj1.method(1000,2000.5f);
	}
}
