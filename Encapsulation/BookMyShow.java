class PvrMovies
{
	private static PvrMovies mTicket;
	private static boolean ticketStatus=false;
	
	private PvrMovies()
	{
		System.out.println("Welcome to PVR Movies");
	}
	public static PvrMovies bookTickets()
	{
		if (ticketStatus==false)
		{
			System.out.println("Ticket Booking is in Progress...");
			mTicket = new PvrMovies();
			ticketStatus=true;
		}
		return  mTicket;
	}
}


/*
	Single ton Design Pattern is a process to ensure at any point of time
	we are able to create one object at a time and if we try to create
	multiple objects for instance at any point of time it will return 
	the same address of s same object.
*/


class BookMyShow
{
	public static void main(String args[])
	{
		PvrMovies custTicket1 = PvrMovies.bookTickets();
		System.out.println("Your Ticket ID is : "+custTicket1);
		PvrMovies custTicket2 = PvrMovies.bookTickets();
		System.out.println("Your Ticket ID is : "+custTicket2);
		PvrMovies custTicket3 = PvrMovies.bookTickets();
		System.out.println("Your Ticket ID is : "+custTicket3);
	}
}


/*
	Approaches to create single ton design pattern:

		1. To create private constructor to restriction instance
		(object creation from another class) creation of class from other class

		2. private static reference variables of same class which is the
		only instance of the class.

		3. public static method that return the instance of class , 
		this is the globle entry point for any other service to entire within class.
*/