class StaticvarInNStaticArea
{
	static float number=100.5f;
	static void myMethod()
	{
		System.out.println("Inside the static method and access by non static area and then main()");
	}

	void nonStaticArea()
	{
		// by class name
		System.out.println(StaticvarInNStaticArea.number);
		StaticvarInNStaticArea.myMethod();
		
		System.out.println();

		// direct way
		System.out.println(number);
		myMethod();
	}

	public static void main(String[] args)
	{
		StaticvarInNStaticArea refVar = new StaticvarInNStaticArea();
		refVar.nonStaticArea();
	}
}