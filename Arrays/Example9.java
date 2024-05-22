class Example9
{
	public static void main(String[] args)
	{

		Emp e1=new Emp(101,"Sahil");		/* constructor of Emp class there is need to create an
											non static variables and store the current object address also means (this) keyword is used */ 
		Emp e2=new Emp(102,"Owai");
		Emp e3=new Emp(103,"Navid");

		Emp[] array= new Emp[3];			// create and array of Emp

		array[0]=e1;
		array[1]=e2;
		array[2]=e3;
		
		for (int i=0;i<array.length ;i++ )
		{
			Emp ee=array[i];							// Store the array index in variable type class
			System.out.println(ee.rollno+"-"+ee.name);	// call constructor local variable.
		}
	}
}