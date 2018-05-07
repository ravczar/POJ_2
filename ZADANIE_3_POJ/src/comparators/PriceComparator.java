package comparators;

import java.util.Comparator;

import modul.Car;

public class PriceComparator implements ICanFilter {

	private static String compareType;

	public static Comparator<Car> Compare= new Comparator<Car>() {
		public int compare(Car car1, Car car2) {

	      	if(compareType == "ASC")
	      		return car1.getPrice() - car2.getPrice();
	      	else if (compareType == "DESC")
	      		return car2.getPrice() - car1.getPrice();
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		PriceComparator.compareType = ASC_or_DESC;
	}
}
