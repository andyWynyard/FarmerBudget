public class FarmerBrown {
	public static void main(String[] args) {

		// Added variables to use in if statements.
		double sCost = 10.00; 	// Cost of one sheep
		double gCost = 3.50;	// Cost of one Goat
		double cCost = 0.50;	// Cost of one Chicken

		/* 
		* Included variables to limit the max loop to
		* what can be afforded on the budget.
		* This just makes the code more efficient,
		* and is the Study Drill. 
		*/
		
		for (int s = 1; s <= (100/sCost) ; s++) {
			for (int g = 1; g <= (100/gCost); g++) {
				for (int c = 1; c <= (100/cCost); c++) {
					if (s+g+c == 100 && 10.00*s + 3.50*g + 0.50*c == 100.00) {
						System.out.println( s + " sheep, "
							+ g + " goats and " + c
							+ " chickens.");
					}
				}
			}
		}
	}
}
