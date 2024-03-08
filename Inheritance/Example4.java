// Hierarchical Inheritance

// So many classes are inherites the same class 

// Bussiness Logic
class A
{
	int rollNo=25;
	void method1()
	{
		System.out.println("Roll number of student is : "+rollNo);
	}
}

class B extends A
{
	char namelatter='S';
	void method2()
	{
		System.out.println("Students name start with : "+namelatter);
	}
}

class C extends A
{
	float percent = 89.37f;
	void method3()
	{
		System.out.println("Percent of student are : "+percent);
	}
}

class D extends A
{
	boolean pass = true;
	void method4()
	{
		System.out.println("Student is pass : "+pass);
	}
}
//Controller Class
class Example4
{
	public static void main(String[] args)
	{
		// Access only the A class members
		A obj1 = new A();
		System.out.println("Roll No. : "+obj1.rollNo);
		obj1.method1();
		System.out.println("------------------------------");

		// Access both class members (B class is child of A class And Example2 is the Controller Class )
		B obj2 = new B();
		System.out.println("Name : "+obj2.namelatter);
		obj2.method2();
		System.out.println("Roll No. : "+obj2.rollNo);
		obj2.method1();
		System.out.println("------------------------------");

		C obj3 = new C();
		System.out.println("Percent : "+obj3.percent);
		obj3.method3();
		System.out.println("Roll No. : "+obj3.rollNo);
		obj3.method1();
		System.out.println("------------------------------");

		D obj4 = new D();
		System.out.println("Result : "+obj4.pass);
		obj4.method4();
		System.out.println("Roll No. : "+obj4.rollNo);
		obj4.method1();
		System.out.println("------------------------------");
	}
}