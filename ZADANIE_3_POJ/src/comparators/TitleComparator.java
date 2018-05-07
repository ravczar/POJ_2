package comparators;

import java.util.Comparator;

import modul.Car;

public class TitleComparator implements ICanFilter {
	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) {
	      String title_1 = car1.getTitle().toUpperCase();
	      String title_2 = car2.getTitle().toUpperCase();
	      	if(compareType == "ASC")
	      		return title_1.compareTo(title_2);
	      	else
	      		return title_2.compareTo(title_1);
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		TitleComparator.compareType = ASC_or_DESC;
	}
}
