class Example16
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		try

		{
			System.out.println("Inside the try block --- 1");
			System.out.println(a[10]);
			System.out.println(10/0);
		}
		catch (Exception e)
		{
			System.out.println("Inside the catch block --- 2 "+e);	
		}
	}
}

// Inside the catch block --- 2 java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5

/*
	If there are different types of exceptions raised within the try block then we need to handle it with help of
	multiple catch blocks but it is not feasible or real time solution hence with the help of polymorphic behavior 
	catch blocks we can use only one catch block

	Q. If we print the reference variable of an exception then it will print then it will not print address but it will print exception info.???
	ANS: When we print reference variable internally it will call toString(). Whenever toString() call it is responsible to print the address.
*/