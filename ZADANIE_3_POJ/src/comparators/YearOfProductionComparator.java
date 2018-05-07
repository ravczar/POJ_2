package comparators;

import java.util.Comparator;

import modul.Car;

public class YearOfProductionComparator implements ICanFilter{
	
	private static String compareType;

	public static Comparator<Car> Compare = new Comparator<Car>() {
		public int compare(Car car1, Car car2) {

	      	if(compareType == "ASC")
	      		return car1.getYearOfProduction() - car2.getYearOfProduction();
	      	else if (compareType == "DESC")
	      		return car2.getYearOfProduction() - car1.getYearOfProduction();
	      	else return 0;
	    }
	};
	
	@Override
	public void howToSort(String ASC_or_DESC) {
		YearOfProductionComparator.compareType = ASC_or_DESC;
	}
}


