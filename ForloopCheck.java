class ForloopCheck
{

	public static void main(String args[])
	{

		int variable = 5;
		
		System.out.println(variable);		// print original value	[5]
		System.out.println(++variable);		// in pre-Increment , it increment value first and print incremented value	[6]
		System.out.println(variable);		// print upcoming value [6]
		System.out.println(variable++);		// first of all print the previous value and in next statement it print incremented value	[6]
		System.out.println(variable);		// Print Incremented value	[7]

	}
}