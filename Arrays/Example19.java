class Example19
{
	public static void main(String[] args)
	{
		/*
				10 20 30
				40 50 60
		*/
		// 1st approach to declare the Multidimensional array
		int[][] array=new int[2][3];
		
		array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		array[1][0]=40;
		array[1][1]=50;
		array[1][2]=60;

		System.out.println(array[0][1]);
		System.out.println(array[0][2]);
		System.out.println(array[1][1]);


			

	}
}