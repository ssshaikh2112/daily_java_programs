class Example19
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
		catch(Exception e)
		{
			System.out.println("Inside Exception...");
		}
		catch (ArithmeticException e)
		{	
			System.out.println("Inside ArithmeticException ...");	
		}
		
	}
}

/*
	Multiple catch blocks are not allowed if the order of the catch block are from parent to child.

	All exception will handled in the first catch block (Exception e) thats why error generate.

	Example19.java:16: error: exception ArithmeticException has already been caught
                catch (ArithmeticException e)
*/