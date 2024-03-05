class Example7
{

	{
		int number1 =19 , number2 = 2 , result;
		result = number1+number2;
		System.out.println("Non static block "+result);
	}

	Example7()
	{
		
		System.out.println("0 Parameter constructor");
	}

	Example7(int number)
	{
		this();		// transfer the control to another constructor
		System.out.println("The value pf number is in the constructor is "+ number);
	}
	public static void main(String[] args)
	{
		Example7 obj1 =new Example7(12);

	}
}