class FirstClass
{
	static int number1=10;
}

class SecondClass
{
	static float number2=100.5f;
}

class ResultClass
{
	static int result1;
	static float result2;
}


class StaticVarAddThreeClass
{
	static int number3=100;


	public static void main(String args[])
	{
		float number4=25.5f;

		ResultClass.result1= FirstClass.number1+number3;	// use the class_name and dot(.) to access the variable in the another class
		System.out.println(ResultClass.result1);			// within class variables are acessible by direct way but outside class are not access

		ResultClass.result2= SecondClass.number2+number4;	// use the class_name and dot(.) to access the variable in the another class
		System.out.println(ResultClass.result2);			// within class variables are acessible by direct way but outside class are not access
	}
}