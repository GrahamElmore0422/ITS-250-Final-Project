package finalProject;

public class HonusCard {

	int quality, salesDate, estimatedValue;
	int[][] salesHistory;
	
	public HonusCard() {		
	}
	
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
