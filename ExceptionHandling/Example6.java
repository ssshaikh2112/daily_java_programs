class Example6
{
	public static void main(String[] args)
	{
		int a[] ={10,20,30,40};
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(a[10]);		// ArrayIndexOutOfBoundsException NO Execute
		}
		catch (ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("These is the catch block...");	// Execute
			System.out.println(a[1]);	// Execute
		}
	}
}