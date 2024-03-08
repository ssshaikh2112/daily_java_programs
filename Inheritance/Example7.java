
// Hybrid Inheritance

class A1
{
	void m1()
	{
		System.out.println("These is the Class A1 method...");
	}
}

class B1 extends A1
{
	void m2()
	{
		System.out.println("These is the Class B1 method...");
	}
}

class C1 extends A1
{
	void m3()
	{
		System.out.println("These is the Class C1 method...");
	}
}

class D1 extends B1
{
	void m4()
	{
		System.out.println("These is the Class D1 method...");
	}
}

class E1 extends C1
{
	void m5()
	{
		System.out.println("These is the Class E1 method...");
	}
}

class Example7
{
	public static void main(String[] args)
	{
		D1 obj1 = new D1();
		obj1.m4();
		obj1.m2();
		obj1.m1();
		System.out.println("-----------------------------------");
		E1 obj2 = new E1();
		obj2.m5();
		obj2.m3();
		obj2.m1();
	}
}