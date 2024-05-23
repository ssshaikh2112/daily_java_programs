class Example12
{
	static int[] method()
	{
		System.out.println("This is static method...");
		int[] array ={10,20,30};
		return array;				// return multiple values
	}

	public static void main(String[] args)
	{
		

		int aa[]=method();					// for itterating array assign method to aa
		for (int i=0;i<aa.length ;i++ )
		{
			System.out.println(aa[i]);
		}
	}
}