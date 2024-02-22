class StaticMPByVAdd
{
	
	static float additionmethod(float number1 , int number2)
	{
		float result=number1+number2;

		return result;

	}

	public static void main(String args[])
	{
		float number1=21f;
		int number2=1;

		float result=additionmethod(number1 , number2);

		System.out.println(result);
	}
}