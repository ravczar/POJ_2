package filter;

import java.util.ArrayList;
import modul.Car;
import modul.CarGenerator;
import modul.PrintTable;

public class MIleageFilter {
	public static void PrivideLowesAndHighestMileage(CarGenerator podaj, int lowestMIleage, int highestMileage ) {
		int i=0;
		ArrayList<Car> mewa = new ArrayList<Car>();
		for (Car car : podaj.getAllGeneratedCars()) {
			if (car.getMileage() >= lowestMIleage && car.getMileage() <= highestMileage ) {
				mewa.add(car);
				i++;
			}
		}
		PrintTable.PrintOutTableWithCars(mewa);
		System.out.println("Fur z przebiegiem wiekszym od: " + lowestMIleage +" i mniejszym od: "+ highestMileage +" Jest: "+ i + ". Wszystkich aut jest: " + podaj.getAllGeneratedCars().size());
		
	}
}
