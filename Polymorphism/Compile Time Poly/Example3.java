class Example3
{
		// To acheive overloading there is sufficient one class
		void method1()
		{
			System.out.println("These is the 0 args method - 1");
		}
		void method1(int a)
		{
			System.out.println("These is the 1 args method - 2");
		}
		void method1(float a , int b)
		{
			System.out.println("These is the 2 args method - 3");
		}

	public static void main(String args[])
	{
		Example3 ref = new Example3();
		ref.method1();
		ref.method1(1);
		ref.method1(4f , 4);
	}
}