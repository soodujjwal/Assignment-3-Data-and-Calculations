import java.util.Scanner;
public class GallonsToLitres {

	public static void main(String[] args) {




	
		   final double GAL2LT = 3.78541;
		   Scanner input = new Scanner(System.in);
		   double inputGallons = 0.0;
		   double resultLiters = 0.0;
		   System.out.println("Gallons to liter converter: ");
		   System.out.println("How many Gallons??");
		   inputGallons = input.nextDouble();
		   resultLiters = inputGallons * GAL2LT;
		   System.out.print("Converted: " + inputGallons + " Gal" + " = ");
		   System.out.println(resultLiters + " Litre");
		}
		
		

	



	}


