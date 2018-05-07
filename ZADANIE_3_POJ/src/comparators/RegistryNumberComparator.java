package comparators;

import java.util.Comparator;
import modul.Car;

public class RegistryNumberComparator implements ICanFilter {

	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) {
		      String carRegistryNO_1 = car1.getNrRej().toUpperCase();
		      String carRegistryNO_2 = car2.getNrRej().toUpperCase();
	      	if(compareType == "ASC")
	      		return carRegistryNO_1.compareTo(carRegistryNO_2);
	      	else if (compareType == "DESC")
	      		return carRegistryNO_2.compareTo(carRegistryNO_1);
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		RegistryNumberComparator.compareType = ASC_or_DESC;
	}
}
