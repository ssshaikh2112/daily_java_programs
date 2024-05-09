class Example11
{
	public static void main(String[] args)
	{
		// Convert String to StringBuffer	--> We can use Constructor base Approach

		String str = "Sahil";						//Immutable
		System.out.println(str);
		StringBuffer sb1 = new StringBuffer(str);	//Immutable
		System.out.println(sb1);
		sb1.append("Shaikh");
		System.out.println(sb1);

	}
}
/*
	String to StringBuffer -- > Constructor
	public jaav.lang.StringBuffer(java.lang.String);
	public jaav.lang.StringBuffer append(java.lang.String);
*/