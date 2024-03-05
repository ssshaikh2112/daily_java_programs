class DemoAnother
{
		int number1  , number2 , result;		// instance members
	{
		result=number1+number2;
		System.out.println("Non static block "+result);
		int number1 =19 , number2 = 2 ;
		result=number1+number2;
	}

	DemoAnother()
	{
		//result  = number1+number2;
		System.out.println("0 Parameter constructor "+result);
	}

}



class Example9
{
	/*
	
	1. Non static variables are use to initialize the non static or instance members/variables.
	2. Instance blocks are used to the implements the bussiness logic during object creation

	*/


	public static void main(String[] args)
	{
		DemoAnother obj1 =new DemoAnother();

	}
}