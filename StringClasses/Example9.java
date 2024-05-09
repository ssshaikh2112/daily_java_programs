class Example9
{
	/*
		equals() when called from String class it always perform content comparision

		equals() when called from Object class it always perform reference comparision

	*/
	public static void main(String[] args)
	{
		String str1 = "Sahil";
		String str2 = "Shaikh";
		String str3 = "Sahil";

		//equals() when called from String class it always perform content comparision

		System.out.println(str1.equals(str2));			// String -- > equals --> content	check
		System.out.println(str2.equals(str3));			// String -- > equals --> content	check
		System.out.println(str3.equals(str1));			// String -- > equals --> content	check

		System.out.println("=================");

		StringBuffer sb1 = new StringBuffer("Sahil");
		StringBuffer sb2 = new StringBuffer("Shaikh");
		StringBuffer sb3 = new StringBuffer("Sahil");

		//equals() when called from Object class it always perform reference comparision

		System.out.println(sb1.equals(sb2));			// Object -- > equals --> reference	check
		System.out.println(sb2.equals(sb3));			// Object -- > equals --> reference	check
		System.out.println(sb3.equals(sb1));			// Object -- > equals --> reference	check
	}
}
// public boolean equals(java.lang.Object)
// == --> reference Comparision
// equals --> content Comparision