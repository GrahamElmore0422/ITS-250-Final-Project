//Samuel Elmore, Ricky Haase
//Final Project, ITS 250 - Dr. Munoz
//Submission November 26, 2019

package finalProject;

public class HonusCard {

	int quality, salesDate, estimatedValue;
	int[][] salesHistory;

	public HonusCard() {		
	}

	//this method selects the correct array from the database and assigns it to the salesHistory attribute for the specified HonusCard object
	public void setHistory() {

		switch (this.quality)
		{
		case 0:
		case 1:
			this.salesHistory = SalesHistoryDatabase.Poor;
		case 2:
			this.salesHistory = SalesHistoryDatabase.Good;
		case 3:
			this.salesHistory = SalesHistoryDatabase.VeryGood;
		default:
			this.salesHistory = SalesHistoryDatabase.Exellent;
		}

	}
}
