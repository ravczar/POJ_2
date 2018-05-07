package comparators;

import java.util.Comparator;
import java.util.GregorianCalendar;

import modul.Car;

public class AddDateComparator implements ICanFilter {

	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) 
		{
			GregorianCalendar carAddDate1 = car1.getDataDodania();
		    GregorianCalendar carAddDate2 = car2.getDataDodania();
	      	if(compareType == "ASC")
	      		return carAddDate1.compareTo(carAddDate2);
	      	else if (compareType == "DESC")
	      		return carAddDate2.compareTo(carAddDate1);
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		AddDateComparator.compareType = ASC_or_DESC;
	}
}
