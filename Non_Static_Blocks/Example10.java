class Example10
{
	int number;
	{
		System.out.println("Instance Block And value of number is  : "+number);
		number = 21;
		System.out.println("Instance Block And value of number is  : "+number);
	}
	
	Example10()
	{
		System.out.println("0 Arguments parameters And value of number is  : "+number);
		number = 12;
		System.out.println("0 Arguments parameters And value of number is  : "+number);
	}

	Example10(int num)
	{
		System.out.println("1 Arguments parameters And value of number is  : "+number);
		number = 22;
		System.out.println("1 Arguments parameters And value of number is  : "+number);
	}


	public static void main(String args[])
	{
		Example10 obj1= new Example10();
		Example10 obj2= new Example10(9);

	}
}