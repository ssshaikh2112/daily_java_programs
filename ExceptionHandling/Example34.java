class Example34
{
	static void m3()
		{
			System.out.println("These is the M3 method");
			try
			{
				System.out.println(10/0);
			}
			catch (ArithmeticException ae)
			{
				ae.printStackTrace();
			}
		}

		static void m2()
		{
			System.out.println("These is the M2 method");
			m3();
		}
		static void m1()
		{
			System.out.println("These is the M1 method");
			m2();
		}
	public static void main(String[] args)
	{
		m1();
	}
}
//Internally which method does java invoke to print exception?
// ANS: printStackTrace();