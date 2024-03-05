class Example8
{
	/*
	
	1. Non static variables are use to initialize the non static or instance members/variables.
	2. Instance blocks are used to the implements the bussiness logic during object creation

	*/

	int number1  , number2 , result;		// instance members
	{
		System.out.println("Non static block "+result);
		int number1 =19 , number2 = 2 ;
		result=number1+number2;
	}

	Example8()
	{
		//result  = number1+number2;
		System.out.println("0 Parameter constructor "+result);
	}

	public static void main(String[] args)
	{
		Example8 obj1 =new Example8();

	}
}