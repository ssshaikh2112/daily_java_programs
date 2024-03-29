class Demo1 extends Demo2		// Cyclic inheritance is not allow by java at class level
{
	void m1()
	{
		System.out.println("");		
	}

}

class Demo2 extends Demo1		// Cyclic inheritance is not allow by java at class level
{
	void m1()
	{
		System.out.println("");		
	}
}

class Example21
{
	public static void main(String[] args)
	{
		
	}
}