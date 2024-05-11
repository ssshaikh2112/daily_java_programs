class Example19
{
	public static void main(String[] args)
	{
		String str="Sahil";

		System.out.println(str.toUpperCase());		// SAHIL
		System.out.println(str.toLowerCase());		// sahil
		
		System.out.println("----------");

		System.out.println(str.isEmpty());			//false
		System.out.println("".isEmpty());			// true
		System.out.println("Success".isEmpty());	//false
		
		System.out.println("----------");

		System.out.println(str.startsWith("Sa"));	// true --> Case Sensitive
		System.out.println(str.startsWith("ab"));	// false

		System.out.println("----------");

		System.out.println(str.endsWith("il"));		// true
		System.out.println(str.endsWith("zx"));		// false
	}
}
//  public java.lang.String toUpperCase();
//  public java.lang.String toLowerCase();
//  public boolean isEmpty();
//  public boolean startsWith(java.lang.String);
//  public boolean endsWith(java.lang.String);