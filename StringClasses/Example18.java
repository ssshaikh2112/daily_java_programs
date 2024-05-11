class Example18
{
	public static void main(String[] args)
	{
		String str="Sahil";

		System.out.println(str.charAt(4));			// l

		System.out.println(str.contains("hil"));	//true
		System.out.println(str.contains("abc"));	//false	: str not contain these letters

		System.out.println(str.indexOf("h"));		//2
		System.out.println(str.indexOf("z"));		//-1	: str not contain these letters

		System.out.println(str.lastIndexOf("h"));	//2
		System.out.println(str.lastIndexOf("z"));	//-1	: str not contain these letters
	}
}

// public char charAt(int index);
//  public int indexOf(int);
//public boolean contains(java.lang.CharSequence);
// public int lastIndexOf(java.lang.String);