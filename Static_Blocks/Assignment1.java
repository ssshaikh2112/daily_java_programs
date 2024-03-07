class Assignment1
{
	static int number=10;
	static char letter='a';

	{
		// check if can initialize static members.  --> YES 

		System.out.println("These is non-static block...");
		System.out.println("Value of static variable 'number' is : "+number);
		System.out.println("Character within the static block is : "+letter);
		number = 21;
		letter='s';
		System.out.println("Initilized value of number within the non static block is : "+number);
		System.out.println("Initilized value of number within the non static block is : "+letter);
	}

	static
	{
		// check if can initialize static members.	--> YES
		System.out.println("These is static block...");
		System.out.println("Value of static variable 'number' is : "+number);
		System.out.println("Character within the static block is : "+letter);
		number = 22;
		letter='p';
		System.out.println("Initilized value of number within the static block is : "+number);
		System.out.println("Initilized value of letter within the static block is : "+letter);
	}

	public static void main(String[] args)
	{
		System.out.println("These is Main area.");
		Assignment1 reVar =new Assignment1();
	}
}