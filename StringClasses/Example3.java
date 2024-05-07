class Example3
{
	public static void main(String[] args)
	{
		// approach -1 : without new keyword
		String first="vdf";
		String second="vdf";
		String third="engineering";
		System.out.println(first==second);		// return true
		System.out.println(second==third);		// return false
		System.out.println(third==first);		// return false
		
		System.out.println();

		// approach -2 : with new keyword
		String fourth = new String("vdf");
		String fifth = new String("engineering");
		String sixth = new String("engineering");
		System.out.println(sixth==fourth);		// return false
		System.out.println(fourth==fifth);		// return false
		System.out.println(fifth==sixth);		// return false
	}
}
// public jaav.lang.String(java.lang.String);