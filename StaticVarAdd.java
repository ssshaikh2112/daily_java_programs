class StaticVarAdd
{
	static int number1=23;
	static float number2=12.5f;

	public static void main(String args[])
	{
		float result;
		
		result = number1+number2;							// direct access
		System.out.println("By using direct access of static variable , the result is : "+result);

		result=StaticVarAdd.number1+StaticVarAdd.number2;	// using class name
		System.out.println("By using class_name access of static variable , the result is : "+result);
	}
}