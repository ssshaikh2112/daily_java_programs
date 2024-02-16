class FactorialNumUsingWhile
{
	public static void main(String args[])
	{
		int number=1;
		int factorial=1;		
		while(number<=8)
		{

			factorial=factorial*number;
			number++;
		}
			System.out.println(factorial);
	}
}