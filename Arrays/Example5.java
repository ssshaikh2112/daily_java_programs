class Example5
{
	public static void main(String[] args)
	{
		int[] array1 = new int[5];
		//System.out.println(array.length);		// length is used for to calculate the length of array.

		for (int i=0;i<array1.length ;i++ )
		{
			System.out.println(array1[i]);		// without declaring the array element int type return 0
		}
		
		
		char[] array2 = new char[5];
		//System.out.println(array.length);		// length is used for to calculate the length of array.

		for (int i=0;i<array2.length ;i++ )
		{
			System.out.println(array2[i]);		// without declaring the array element char type return blank space
		}
		
		
		boolean[] array3 = new boolean[5];
		//System.out.println(array.length);		// length is used for to calculate the length of array.

		for (int i=0;i<array3.length ;i++ )
		{
			System.out.println(array3[i]);		// without declaring the array element boolean type return false
		}
	}
}