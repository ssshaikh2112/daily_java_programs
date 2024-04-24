class Example3
{
	public static void main(String[] args)
	{
		Thread.sleep(3000);
	}
}

// public static void sleep(long millis) throws InterruptedException
// Thread -->	class
// sleep -->     static method
// args in milli second --> 3000 --> 3sec

/*
Example3.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(3000);

	The compiler checks the exception hence it is called Checked Exception.

	Q. Why is it throwing the interuted exception??
	Ans: Because , the main method contains sleep() that may be the cause 
		of there programs get Impacted to get executed that why it will throw interrupted exception
	
	Q. Whenever Program throw or generate checked exception will the program compile?
	Ans : No.
*/