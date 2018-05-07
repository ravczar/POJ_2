package filter;

import java.util.ArrayList;
import java.util.List;

import modul.Car;
import modul.CarGenerator;

public class MIleageFilter {
	
	private static List<Car> list = new ArrayList<Car>();

	public static List<Car> getAllFilteredCars() {
		return list;
	}
	
	public static void PrivideLowestAndHighestMileage(CarGenerator podaj, int lowestMIleage, int highestMileage ) {
		int i=0;
		for (Car car : podaj.getAllGeneratedCars()) {
			if (car.getMileage() >= lowestMIleage && car.getMileage() <= highestMileage ) {
				list.add(car);
				i++;
			}
		}
		System.out.println("Fur z przebiegiem wiekszym od: " + lowestMIleage +" i mniejszym od: "+ highestMileage +" Jest: "+ i + ". Wszystkich aut jest: " + list.size() + ". Patrz auta poni¿ej.");
	}
}
