class Example20
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		try
		{
			System.out.println("Inside the try block --- 1");
			System.out.println(10/0);
			System.out.println(a[10]);
		}
		catch(Throwable e)
		{
			System.out.println("Inside Throwable Exception...");
		}
		
	}
}

/*
	Rather than using multiple catch blocks it is always better to use a single catch block

	As a single catch block can either handle exception of type "Throwable" or type exception.
*/