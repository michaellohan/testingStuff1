package apackage;

public class Class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Bike shanesBike = new Bike();
		shanesBike.height = "1";
		shanesBike.weight = "1";
		shanesBike.length = "1";
		
		Bike michaelsBike = new Bike();
		michaelsBike.height ="1";
		michaelsBike.weight = "1";
		michaelsBike.length = "1";
		
		if (michaelsBike == shanesBike){
			System.out.println("==yes");
		}
		else System.out.println("==no");
	
	
	
	if (michaelsBike.equals(shanesBike)){
			System.out.println("equals YES");
		}
		else 
			System.out.println("equals NO");

	}


}


