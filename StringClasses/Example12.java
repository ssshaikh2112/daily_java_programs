class Example12
{
	public static void main(String[] args)
	{
		// StringBuffer to String 2 approach
		// 1. Constructor	2. toString()

		StringBuffer sb1 = new StringBuffer("Sahil");
		System.out.println(sb1);
		// Constructor
		String str1 = new String(sb1);
		System.out.println(str1);
		// toString()
		StringBuffer sb2 = new StringBuffer("Shaikh");
		System.out.println(sb2);
		String str2 = sb2.toString();
		System.out.println(str2);
	}
}
// public jaav.lang.StringBuffer(java.lang.String);
// public jaav.lang.String(java.lang.StringBuffer);
// public jaav.lang.String toString();