class AnotherClass
{
	static int number;
	static
	{
		System.out.println("These is static block : "+ number);
		number = 10;
	}

	static void method()
	{
		System.out.println("Value of number is : "+number);
	}
}


class Example6
{

	public static void main(String[] args)
	{
		System.out.println("These is Main block...");
		System.out.println("Value of number in AnotherClass is : "+AnotherClass.number);
	}
}

/*
	Only when JVM is clear as well as aware to call other class members only then an
	explicity call will be give to class loader to load the static members in memory
*/