class Example13
{
	public static void main(String[] args)
	{
		String str1 = "college";
		String str2 = "college";
		System.out.println(str1.compareTo(str2));

		String str3 = "school";
		String str4 = "college";
		System.out.println(str3.compareTo(str4));

		String str5 = "college";
		String str6 = "school";
		System.out.println(str5.compareTo(str6));
	}
}
// public int compareTo(java.lang.String);

/*
	The compareTo() return int value.

	If both Strings are same which means if first string 
	return the unicode value same as second string then it return 0.
	
	If first Strings are greater which means if first string 
	return the unicode value greater as second string then it return +.

	If first Strings are less which means if first string 
	return the unicode value less as second string then it return -.

*/