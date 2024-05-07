class Example2
{
	public static void main(String[] args)
	{
		// approach -1 : without new keyword
		String first="vdf";
		String second="school";
		String third="engineering";
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		System.out.println();

		// approach -2 : with new keyword
		String fourth = new String("vdf");
		System.out.println(fourth);
		String fifth = new String("school");
		System.out.println(fifth);
		String sixth = new String("engineering");
		System.out.println(sixth);
	}
}
// public jaav.lang.String(java.lang.String);