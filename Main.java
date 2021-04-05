package Exercise2_2; 

public class Main {
	public static void main(String[] args) {
		
		Smartwatch Fitbit= new Smartwatch();
		Smartwatch Garmin= new Smartwatch();
		Smartwatch Suunto= new Smartwatch();
		Smartwatch Guess= new Smartwatch();
	    
		System.out.println("\tWelcome to Smartwatch Shop");
		System.out.println("==================================");
		//Print Info of Smartwatch
		System.out.println("\tFitbit SPECIFICATION");
		Fitbit.printInfo("Versa 2", "Rose gold",395,'N',"5ATM");
		Fitbit.printDetect("the number of calories burn.");		
		Fitbit.printBluetooth("bluetooth headphones and with 300+ songs in several \nmusic apps like Spotify.");
		Fitbit.printMessaging("Yes.","text through SMS,Gmail and Messenger.");
		Fitbit.calPrice(395,3);

		System.out.println("\tGarmin SPECIFICATION");
		Garmin.printInfo("Vivosmart HR", "Midnight Blue", 559,'Y',"10ATM");	
		Garmin.printDetect("the heart rate.");			
		Garmin.printBluetooth("allows you to connect a variety of devices to it.");
		Garmin.printMessaging("No.","will not receive smart notifications.");
		Garmin.calPrice(559,4);
		
		System.out.println("\tSuunto SPECIFICATION");
		Suunto.printInfo("Traverse", "White", 639, 'Y',"10ATM");	
		Suunto.printDetect("as countdown timer.");		
		Suunto.printBluetooth("have bluetooth chipset,bluetooth heart rate belt and PODs.");
		Suunto.printMessaging("Yes.","text through FB Messenger,Line and so on.");
		Suunto.calPrice(639,2);
		
		System.out.println("\tGuess SPECIFICATION");
		Guess.printInfo("Rex Mens Digital+", "Grey", 699, 'Y',"3ATM");	
		Guess.printDetect("walking step.");	
		Guess.printBluetooth("allows you to connect a variety of devices to it.");
		Guess.printMessaging("No.","just receive message notification and incoming email only.");
		Guess.calPrice(699,1);
		System.out.println("--Thank you and have a nice day--");
	}

}
