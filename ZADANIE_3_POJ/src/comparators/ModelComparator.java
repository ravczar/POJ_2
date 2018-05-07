package comparators;

import java.util.Comparator;
import modul.Car;

public class ModelComparator implements ICanFilter {

	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) {
		      String carModel_1 = car1.getModel().toUpperCase();
		      String carModel_2 = car2.getModel().toUpperCase();
	      	if(compareType == "ASC")
	      		return carModel_1.compareTo(carModel_2);
	      	else if (compareType == "DESC")
	      		return carModel_2.compareTo(carModel_1);
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		ModelComparator.compareType = ASC_or_DESC;
	}
}
