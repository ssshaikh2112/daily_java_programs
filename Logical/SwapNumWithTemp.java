class SwapNumWithTemp
{
	public static void main(String[] args) {
		int num1=5;
		int num2=7;
		int temp;

		System.out.println("Before Swapping : ");
		System.out.println(num1);
		System.out.println(num2);

		System.out.println();

		System.out.println("After Swapping : ");

		temp = num1;
		num1=num2;
		num2=temp;
		System.out.println(num1);
		System.out.println(num2);

	}

}