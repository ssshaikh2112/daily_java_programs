class StaticethodPassByValue
{
	
	static void method1(int number)			// void does not return anything
	{
		System.out.println(number);
	}

	public static void main(String args[])
	{
		int number =100;					// local variable

		method1(100);						// Access by pass-by-value
		
	}
}