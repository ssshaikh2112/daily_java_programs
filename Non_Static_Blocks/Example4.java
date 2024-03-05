class Example4
{

	/*
	
	When object is created then constructor get call , but it check first 
	if any non static block will present or not and then proceed.
	If non static block are present then executed it first and then constructor executed.

	*/


	{
		int number1 =19 , number2 = 2 , result;
		result = number1+number2;
		System.out.println(result);
	}

	Example4()
	{
		System.out.println("The Constructor is called...");
	}
	public static void main(String[] args)
	{
		Example4 obj = new Example4();
	}
}