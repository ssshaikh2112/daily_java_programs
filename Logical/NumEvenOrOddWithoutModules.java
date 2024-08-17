import java.util.Scanner;


class NumEvenOrOddWithoutModules

{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int number=scan.nextInt();

		//System.out.println((number%2==0)?(number+" is even"):(number+" is odd"));
		System.out.println((number/2!=0)?(number+" is even"):(number+" is odd"));

		System.out.println(((number/2)*2==number)?(number+" is even"):(number+" is odd"));
		System.out.println((number/2==number/2.0)?(number+" is even"):(number+" is odd"));
	}
}