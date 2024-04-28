class Example17
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		try

		{
			System.out.println("Inside the try block --- 1");
			System.out.println(a[10]);
		}
		catch (Exception e)
		{
			System.out.println(e);	
		}
	}
}

/*
toString() from Object class is Overridden in Throwable class so 
its behavior will change and it print exception info not address
*/