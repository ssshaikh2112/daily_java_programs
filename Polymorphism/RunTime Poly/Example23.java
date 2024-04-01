class Aclass
{
	void aclassMethod()
	{
		System.out.println("These is the Method of - Aclass");
	}
}

class Bclass extends Aclass
{
	void bclassMethod()
	{
		System.out.println("These is the Method of - Bclass");
	}
}

class Cclass extends Bclass
{
	void cclassMethod()
	{
		System.out.println("These is the Method of - Cclass");
	}
}

class Example23
{
	public static void main(String[] args)
	{
		// Upcasting
		Bclass obj1=new Cclass();
		obj1.bclassMethod();
		obj1.aclassMethod();
		System.out.println("--------------------------------");
		
		Aclass obj2=(Aclass)obj1;
		obj2.aclassMethod();
		System.out.println("--------------------------------");

		// DownCasting
		Cclass obj3 = (Cclass)obj2;
		obj3.aclassMethod();
		obj3.bclassMethod();
		obj3.cclassMethod();
	}
}