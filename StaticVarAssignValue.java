class StaticVarAssignValue
{
	static int number;

	public static void main(String args[])
	{
		int number2=11;

		StaticVarAssignValue.number=number2;	// 1. Direct access		2. Class_Name using		3. Object_Creation
		System.out.println(number);
	}
}