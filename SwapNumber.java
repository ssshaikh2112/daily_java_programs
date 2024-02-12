class SwapNumber
{

// Swap value of number using third variable or temp variable

	public static void main(String args[])
	{
		int number1=10,number2=15;		//initialization and declaration
		int temp=0;				//swap using temporary variable
		
		System.out.println("The number1 is before swapping : " +number1);	//initial value of number1 is 10
		System.out.println("The number2 is before swapping : " +number2);	//initial value of number2 is 15

		temp=number1;				//move value of number1 in temp
		number1=number2;			//value of number2 is assign to number1 so now number1 = 15
		number2=temp;				//value of temp is assign to number2 so now number2 = 10

		System.out.println("The number1 is After swapping : " +number1);
		System.out.println("The number2 is After swapping : " +number2);

		
	}
}