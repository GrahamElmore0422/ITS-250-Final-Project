//Samuel Elmore, Ricky Haase
//Final Project, ITS 250 - Dr. Munoz
//Submission November 26, 2019

package finalProject;

public class FindValue {
	
	//Method returns estimate for a sale price, or a historical sales price if one exists
		public static void returnStuff(HonusCard wagner)
		{		

			wagner.setHistory(); //Program uses card quality to match the card to the right sales history

			//Check date
			if (wagner.salesDate < 1909) { //Pre-print
				System.out.println("The T206 Honus Wagner card did not exist before 1909");
			}
			else if (wagner.salesDate >= 1909 && wagner.salesDate <= 1911) { //Pre-discontinuation
				System.out.println("The card was sold with cigerette boxes until Wagner said \"NO MORE\" in 1911, "
						+ "only 50-200 were ever printed");
			}
			else if (wagner.salesDate > 1911 && wagner.salesDate < 1985) { //Pre-fame
				System.out.println("Nobody really cared about the card until 1985, when it sold for a good chunk of money");
			}
			else {
				int sale = linearSearch(wagner); //See if a card of this quality was sold during this year

				if (sale == -1) {//If not, estimate the value of the card during the year and tell it to the user
					wagner.estimatedValue = SalesHistoryDatabase.estimateValue(wagner);

					if (wagner.estimatedValue < 1000) { //If the estimate is negative or unrealistically low
						System.out.println("I'm having a hard time estimating the value of this card at this time");
					}
					else {
						System.out.println("I estimate this card to have a value of $" + wagner.estimatedValue + " in " + wagner.salesDate);
					}

				}
				else {//If so, tell the user how much the card sold for in real life
					System.out.println("A card of this quality sold for $" + wagner.salesHistory[1][sale] + " in " + wagner.salesDate);
				}

			}

		}

		//Linear search, which sees if the card sold for a certain value in that year
		public static int linearSearch (HonusCard wagner) {
			//Check every item in the first row(?) of the referenced array to see if the year matches the given one
			for (int i = 0; i < wagner.salesHistory[0].length; i++) {
				if (wagner.salesDate == wagner.salesHistory[0][i])
					return i; //Return index of the year in question
			}

			return -1; //If the specified year is note found within the proper array, return a "default" value

		}

		
}
