class Example10
{
	/*
		equals() when called from String class it always perform content comparision

		equals() when called from Object class it always perform reference comparision

	*/
	public static void main(String[] args)
	{
		Example10 ref1 = new Example10();
		Example10 ref2 = new Example10();
		Example10 ref3 = ref1;
		System.out.println(ref1.equals(ref2));		// Object -- > equals --> reference	check
		System.out.println(ref2.equals(ref3));		// Object -- > equals --> reference	check
		System.out.println(ref3.equals(ref1));		// Object -- > equals --> reference	check

		System.out.println("=================");

		StringBuffer sb1 = new StringBuffer("Sahil");
		StringBuffer sb2 = new StringBuffer("Shaikh");
		StringBuffer sb3=sb1;

		//equals() when called from Object class it always perform reference comparision

		System.out.println(sb1.equals(sb2));			// Object -- > equals --> reference check
		System.out.println(sb3.equals(sb1));			// Object -- > equals --> reference check
	}
}
// public boolean equals(java.lang.Object)
// == --> reference Comparision
// equals --> content Comparision