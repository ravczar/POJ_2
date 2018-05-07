package comparators;

import java.util.Comparator;
import modul.Car;

public class BrandComparator implements ICanFilter {

	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) {
		      String carBrand_1 = car1.getBrand().toUpperCase();
		      String carBrand_2 = car2.getBrand().toUpperCase();
	      	if(compareType == "ASC")
	      		return carBrand_1.compareTo(carBrand_2);
	      	else if (compareType == "DESC")
	      		return carBrand_2.compareTo(carBrand_1);
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		BrandComparator.compareType = ASC_or_DESC;
	}
}
