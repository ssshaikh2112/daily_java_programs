class Example5
{
	/*
	
	THere is no effect of construct ie. parametorized constructor or non paramatorised 
	non static block execute first.

	*/

	{
		int number1 =19 , number2 = 2 , result;
		result = number1+number2;
		System.out.println(result);
	}


	Example5(int number)
	{
		System.out.println("The value pf number is in the constructor is "+ number);
	}
	public static void main(String args[])
	{
		Example5 obj = new Example5(12);
	}
}