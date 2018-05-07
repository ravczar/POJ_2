package filter;

import java.util.ArrayList;
import java.util.List;

import modul.Car;
import modul.CarGenerator;

public class DateOfProdFilter {
	private static List<Car> list = new ArrayList<Car>();

	public static List<Car> getAllFilteredCars() {
		return list;
	}
	
	public static void PrivideBottomAndTopYear(CarGenerator podaj, int bottomYear, double topYear) {
		int i=0;
		for (Car car : podaj.getAllGeneratedCars()) {
			
			if (car.getYearOfProduction() >= bottomYear && car.getYearOfProduction() <= topYear ) {
				list.add(car);
				i++;
			}
		}
		System.out.println("Siema, takich fur po 2000 roku jest: " + i + " ,a wszystkich aut jest: " + podaj.getAllGeneratedCars().size());
	}
}
