package comparators;

import java.util.Comparator;

import modul.Car;

public class MIleageComparator implements ICanFilter {

	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) {

	      	if(compareType == "ASC")
	      		return car1.getMileage() - car2.getMileage() ;
	      	else if (compareType == "DESC")
	      		return car2.getMileage() - car1.getMileage();
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		MIleageComparator.compareType = ASC_or_DESC;
	}
}
