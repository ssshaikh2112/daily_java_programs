class Example9
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("These is the try block...");
			System.out.println(10/2);	
		}
		catch(NullPointerException npe)		// Not execute
		{
			System.out.println("These is the catch block...");	// Not execute
		}

		
	}
}

/*
	Java is not particular about the exception type within the catch block.
	Whenever there is no Exception generated but Java is particular about the
	exception type within catch block whenever an exception raised within try block.
*/
