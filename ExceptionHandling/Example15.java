class Example15
{
	public static void main(String[] args)
	{
		int[] a={10,20,30};
		try
		{
			System.out.println("These is the try block...");	// Execute
			System.out.println(a[2]);		// ArrayIndexOutOfBoundsException Execute

		}
		catch (ArrayIndexOutOfBoundsException aiobe) // Two catch blocks having the same type of an exception will not be allowed.
		{
			System.out.println("These is the catch block --> ArrayIndexOutOfBoundsException -- 1");	// Not Execute

		}
		catch (ArrayIndexOutOfBoundsException aiobe)	// Two catch blocks having the same type of an exception will not be allowed.
		{
			System.out.println("These is the catch block --> ArrayIndexOutOfBoundsException --- 2");	// Not Execute

		}
	}
}

// Two catch blocks having the same type of an exception will not be allowed.

/*
	Example15.java:17: error: exception ArrayIndexOutOfBoundsException has already been caught
                catch (ArrayIndexOutOfBoundsException aiobe)
*/