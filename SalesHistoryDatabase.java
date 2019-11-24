//Samuel Elmore, Ricky Haase
//Final Project, ITS 250 - Dr. Munoz
//Submission November 26, 2019

package finalProject;

public class SalesHistoryDatabase {

	//Stores all of our known sales of the Honus Wagner card, one array for each card quality
	static int[][] Exellent = 
		{{1985, 19987, 1991, 1995, 1996, 2000, 2007, 2008, 2013, 2016},
		{25000, 110000, 451000, 500000, 641500, 126500, 2350000, 1620000, 2105770, 3120000}};
	
	static int[][] VeryGood =
		{{2005, 2008, 2012},
		{456000, 791000, 1200000}};
	
	static int[][] Good =
		{{2000, 2005, 2006, 2014, 2016, 2019},
		{75000, 237000, 294338, 776750, 657250, 1200000}};
	
	static int[][] Poor =
		{{2004, 2005, 2008, 2009, 2010},
		{109638, 132000, 317250, 400000, 262000}};
	
	//method to estimate the value of the card for any unknown sale date.
	//The equations are based on the line of best fit equations for each data set
	public static int estimateValue (HonusCard wagner) {

		double e;

		switch (wagner.quality){
			case 0:
			case 1:
				e = 39782.029850 * wagner.salesDate + -79606312.714205; break;
			case 2:
				e = 53788.861314 * wagner.salesDate + -107575554.907543; break;
			case 3:
				e = 106067.567562 * wagner.salesDate + -212203364.854193; break;
			default: 
				//quadratic equation for a more accurate estimate. This is due to the explosive growth of high-quality cards in more recent years
				//Math.pow is a way to get exponential function in java since there is no way to do exponential math within the syntax 
				e = 4541309277.0 - 5000000 * wagner.salesDate + 1200 * Math.pow(wagner.salesDate, 2);
				break;
		}

		return (int)e;

	}
	
}