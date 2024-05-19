class Example3
{
	public static void main(String[] args)
	{
		int[] array=new int[3];
		array[0]=10;
		array[1]=20;
		array[2]=true;					// boolean cannot be converted to int
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}