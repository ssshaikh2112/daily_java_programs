class Example8
{
	public static void main(String[] args)
	{
		String str1 = new String("Sahil");
		System.out.println(str1);
		str1.concat("Shaikh");
		System.out.println(str1);		// String are Immutable

		System.out.println("============");

		StringBuffer str2 = new StringBuffer("Sahil");
		System.out.println(str2);
		str2.append("Shaikh");			// StringBuffer are Mutable
		System.out.println(str2);
	
	}
}

// public jaav.lang.StringBuffer append(java.lang.String);