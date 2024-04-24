class Example1
{
	public static void main(String[] args)
	{
		System.out.println(10/0);
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Example1.main(Example1.java:5)
*/

/*
This is an Unchecked exception.
The exception raised is of type Arithmetic because operation performed is of Arithmetic.

It deos not check the exception but JVM checks the exception hence it is called as unchecked exception.
*/