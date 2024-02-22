class StaticMethodPassByValue1
{

	static int method1()		// it return the int value so it have the int return type
	{
		int number=22;
		return number;			// returns the int value
	}

	public static void main(String args[])
	{
		int number=method1();

		System.out.println(number);
	}
}