class A
{
}


class Example14
{
	public static void main(String[] args)
	{
		String[] s=new String[3];		// initialization of array but don't declare
		for(String ss:s)
		{
			System.out.println(ss);		// we don't create array so it return null.
										
		}
		
		System.out.println("-----");

		A[] a=new A[4];
		for(A aa:a)
		{
			System.out.println(aa);
		}
	}
}