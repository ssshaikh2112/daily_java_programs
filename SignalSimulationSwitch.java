class SignalSimulationSwitch
{
	public static void main(String args[])
	{

		
		char signal='r';

		switch(signal)
		{
			case 'r':
				System.out.println("Stop signal is visible...");
				break;
			
			case 'g':
				System.out.println("You can Go Now...");
				break;

			case 'y':
				System.out.println("Go slowely...");
				break;

			default:
				System.out.println("Invalid signal...");
				break;
		}
	}

}
