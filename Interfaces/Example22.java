interface Demo1 extends Demo2		// Cyclic inheritance is not allow by java at interface level
{
	void m1()
	{
		System.out.println("");		
	}

}

interface Demo2 extends Demo1		// Cyclic inheritance is not allow by java at interface level
{
	void m1()
	{
		System.out.println("");		
	}
}

class Example22
{
	public static void main(String[] args)
	{
		
	}
}