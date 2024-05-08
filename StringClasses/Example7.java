class Example7
{
	public static void main(String[] args)
	{
		/*StringBuffer str1 = "Sahil";		Compilation Error

		We can not create StringBuffer object directly without new keyword.
		
		*/

		StringBuffer str1 = new StringBuffer("Sahil");
		System.out.println(str1);
		System.out.println(str1.toString());	// toString()--> StringBuffer
		
		/*
			The toString() is called from object class is always be responsible to print address.

			But it is same toString() is called from String or StringBuffer class or any other child class
			it will not responsible to print the address but it print the some other value.
		*/
	}
}

// public jaav.lang.StringBuffer(java.lang.String);