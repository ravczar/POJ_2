package filter;

import java.util.ArrayList;

import modul.Car;
import modul.CarGenerator;
import modul.PrintTable;

public class DateOfProdFilter {
	public static void PrivideBottomAndTopYear(CarGenerator podaj, int bottomYear, double topYear) {
		int i=0;
		ArrayList<Car> list = new ArrayList<Car>();
		for (Car car : podaj.getAllGeneratedCars()) {
			
			if (car.getYearOfProduction() >= bottomYear && car.getYearOfProduction() <= topYear ) {
				list.add(car);
				i++;
			}
		}
		PrintTable.PrintOutTableWithCars(list);
		System.out.println("Siema, takich fur po 2000 roku jest: " + i + " ,a wszystkich aut jest: " + podaj.getAllGeneratedCars().size());
	}
}
