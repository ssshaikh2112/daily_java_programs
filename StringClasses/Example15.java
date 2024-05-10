class Example15
{
	public static void main(String[] args)
	{
		String str1 = "Sahil";
		String str2 = "sahil";
		// CaseSensitive
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.equals(str2));
		// InCaseSensitive
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
// public boolean equalsIgnoreCase(java.lang.String)
// public int compareToIgnoranceCase(java.lang.String)