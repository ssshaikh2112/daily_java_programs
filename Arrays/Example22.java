class Example22
{
	public static void main(String[] args)
	{
		int[][] array={{10,20,30} ,
						{40,50,60}};

		System.out.println("Length of 1D array is : "+array.length);	//2
		System.out.println("Length of 2D array is : "+array[0].length);

		for (int i=0;i<array.length ;i++ )
		{
			for (int j=0;j<array[1].length ;j++ )
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
	}
}

//Length of 1D array is : -->array.length
//Length of 2D array is : -->array[0].length