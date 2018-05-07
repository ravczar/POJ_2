package filter;

import java.util.ArrayList;
import java.util.List;

import modul.Car;
import modul.CarGenerator;

public class PriceFilter {
	
	private static List<Car> list = new ArrayList<Car>();

	public static List<Car> getAllFilteredCars() {
		return list;
	}

	public static void ProvideLowesAndHighestPrice(CarGenerator podaj, double lowestPrice, double highestPrice) {
	int i=0;
	
	for (Car car : podaj.getAllGeneratedCars()) {
		if (car.getPrice() > lowestPrice && car.getPrice() < highestPrice ) {
			list.add(car);
			i++;
		}
	}
	System.out.println("Fur dro¿szych od: " +lowestPrice+ " ale tanszych od " + highestPrice +" jest: "+ i + ". Patrz lista poni¿ej!");
	}
}
