class Example26
{
	public static void main(String[] args)
	{
	//	StringBuilder sb="sahil";		String cannot be converted to StringBuilder
		StringBuilder sb1=new StringBuilder("sahil");
		System.out.println(sb1);
		sb1.append(" shaikh");		// append() --> add another string at last/end of string
		System.out.println(sb1);
	}
}