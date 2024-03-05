class Example6
{

	


	{
		int number1 =19 , number2 = 2 , result;
		result = number1+number2;
		System.out.println("Non static block "+result);
	}

	Example6()
	{
		System.out.println("0 Parameter constructor");
	}

	Example6(int number)
	{
		System.out.println("The value pf number is in the constructor is "+ number);
	}
	public static void main(String[] args)
	{
		Example6 obj1 =new Example6();
		Example6 obj2 =new Example6(2002);
	}
}