class Example2
{
	public static void main(String[] args)
	{
		int[] a={10,20,30,40};
		System.out.println(a[5]);		// index is out of range 
	}
}

/*
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
        at Example2.main(Example2.java:6)
*/

//ArrayIndexOutOfBoundsException is also Unchecked Exception