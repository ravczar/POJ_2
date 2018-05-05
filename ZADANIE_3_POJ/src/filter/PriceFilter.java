package filter;

import java.util.ArrayList;
import modul.Car;
import modul.CarGenerator;
import modul.PrintTable;

public class PriceFilter {
	
	public static void ProvideLowesAndHighestPrice(CarGenerator podaj, double lowestPrice, double highestPrice) {
	int i=0;
	ArrayList<Car> newa = new ArrayList<Car>();
	for (Car car : podaj.getAllGeneratedCars()) {
		if (car.getPrice() > lowestPrice && car.getPrice() < highestPrice ) {
			newa.add(car);
			i++;
		}
	}
	PrintTable.PrintOutTableWithCars(newa);
	System.out.println("Fur dro¿szych od: " +lowestPrice+ " ale tanszych od " + highestPrice +" jest: "+ i);
	}
}
