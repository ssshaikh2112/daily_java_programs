class String1 extends Object	// extends Object (Optional)
{
	String str;
	String1(String str)			// class type
	{
		this.str=str;
	}
	//Syntax
	public String toString()
	{
		return str;
	}
}
class Example5
{
	public static void main(String[] args)
	{
		Example5 ref1 = new Example5();
		System.out.println(ref1);			// Print address

		String str = new String("Sahil");
		System.out.println(str);

		String1 ref2 = new String1("Shaikh");
		System.out.println(ref2);

		/*
			Whenever the reference variable of String class is printed.
			It will internally call the toString() of the String class.
			And these is print the value rather than address.
		*/
	}
}