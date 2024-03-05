
class Demo
{
	float number=100.5f;
	void myMethod()
	{
		System.out.println();
		System.out.println("Inside the static method and access by non static area and then main() in multiple classes...");
	}
}


class NStaVMInNStaArea
{

	void accessMethod()
	{
		Demo obj1 = new Demo();
		System.out.println(obj1.number);
		obj1.myMethod();
	}
	public static void main(String[] args)
	{
		NStaVMInNStaArea obj2 = new NStaVMInNStaArea();
		obj2.accessMethod();
	}
}