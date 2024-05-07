/*
class Object
{
	public String toString()
	{
		return "address";
	}
}
*/

class Example4	// extends Object
{
	public String toString()
	{
		return "Example4 class";
	}
	public static void main(String[] args)
	{
		Example4 ref = new Example4();
		System.out.println(ref);				// Implicitly call toString()
		System.out.println(ref.toString());		// Explicitly call toString()
	}
}