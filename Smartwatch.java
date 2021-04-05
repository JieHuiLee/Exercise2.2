package Exercise2_2;

public class Smartwatch {
	//declare all type of variable and variable name
		String model; //m
		String color; //c
		int price; //p
		char swimProof; //y
		String waterResistant; //r
	
		void printInfo(String m, String c, int p, char y, String r) { 
			System.out.println("Model : " + m);
			System.out.println("Color : " + c);
			System.out.println("Price : RM " + p);
			System.out.println("Swim-proof(Yes/No): " + y);
			System.out.println("Water Resistant   : " + r);
		}
		
		void printBluetooth(String b) {
			System.out.println("Bluetooth  : Yes. \nIt " + b);
		}
		
		void printMessaging(String n, String t) { //textApp
			System.out.println("Messaging  : "+ n + "\nIt " + t);
		}
		
		void printDetect(String d) {
			System.out.println("Function   : It can detect "+ d);
		}		
		
		void calPrice(int p, int q) {
			int tP = p * q; //Total Price = pricePerUnit * Quantity
			System.out.println("\nQuantity     " + q);
			System.out.println("Total Price  " + "RM" +tP);
			System.out.println("----------------------------------");
		}
		
}
