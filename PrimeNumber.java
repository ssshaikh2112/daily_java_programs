class PrimeNumber 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		int number =8;
		int temp = 0;						 // Temporary variable used and assign the value to avoid the printing of repesting statement in for loop

		for(int i =2; i<=number-1; i++)		// Number is greater than 1 (prime number divisible by 1 and itself so i start from 2 till number - 1)
		{
			if(number%i==0)					// If any number is divided by the between any number so it is not prime number
			{
				temp=temp+1;				// Reference is here of Temp variable
			}
		}

		if(temp>0)							// And here [temp]
		{
			System.out.println("Number is not Prime");	
		}
		else
		{
			System.out.println("Number is Prime");
		}
	}
}
