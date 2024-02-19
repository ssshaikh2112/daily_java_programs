class FirstClass
{
	static int result1;
}

class SecondClass
{
	static float result2;
}


class StaticVarMulClassAdd
{
	static int number1=10,number2=20;

	public static void main(String args[])
	{
		float number3=100.5f,number4=200.5f;
		
		FirstClass.result1=number1+number2;			// use the class_name and dot(.) to access the variable in the another class
		System.out.println(FirstClass.result1);

		SecondClass.result2=number3+number4;		// use the class_name and dot(.) to access the variable in the another class
		System.out.println(SecondClass.result2);
	}
}