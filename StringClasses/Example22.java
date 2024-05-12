class Example22
{
	public static void main(String[] args)
	{
		String str1=" sahil shaikh ";
		System.out.println("Original String is : "+str1);
		System.out.println("length of string is : "+str1.length());
		String str2=str1.trim();		// remove the blank spaces from left and right side
		System.out.println(str2);
		System.out.println(str2.length());		//return length of string
		
		String str3="sahil shaikh";
		System.out.println(str3);
		System.out.println(str3.length());
		System.out.println(str3.trim());



	}
}