class Example16
{
	public static void main(String[] args)
	{
		//String str = "Sahil";		--> Yes True
		String str=null;		//	--> No  False

		if (str instanceof String)	//	--> No  False
		{
			System.out.println("Yes str is holding the data of type String");
		}
		else
		{
			System.out.println("No str is not holding the data of type String");			
		}
	}
}
// instanceof :	instanceof keyword is a binary operator used to test if an object (instance) is a subtype of a given Type.