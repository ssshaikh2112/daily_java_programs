class Example11
{
	public static void main(String[] args)
	{
		Emp[] array= new Emp[3];			// create and array of Emp
		array[0]=new Emp(101,"Sahil");		/* constructor of Emp class there is need to create an
											non static variables and store the current object address also means (this) keyword is used */ 
		array[0]=new Emp(102,"Owai");
		array[0]=new Emp(103,"Navid");


		
		for (Emp ee : array)	// Store the array index in variable type class
		{

			System.out.println(ee.rollno+"-"+ee.name);	// call constructor local variable.
		}
	}
}