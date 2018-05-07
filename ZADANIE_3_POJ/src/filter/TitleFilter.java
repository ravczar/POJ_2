package filter;

import java.util.ArrayList;
import java.util.List;

import modul.Car;
import modul.CarGenerator;

public class TitleFilter {
	private static List<Car> list = new ArrayList<Car>();

	public static List<Car> getAllFilteredCars() {
		return list;
	}
	
	public static void ProvideWordToSeek(CarGenerator podaj, String yourWord ) {
		int i=0;
		
		for (Car car : podaj.getAllGeneratedCars()) {
			if ( car.getTitle().contains(yourWord) ) 
			{
				list.add(car);
				i++;
			}
		}
		System.out.println("Tyle jest tytu��w zawieraj�cych szukane s�owo : " + i + ", a tyle jest wszystkich og�osze�: " + podaj.getAllGeneratedCars().size() + ". Patrz lista poni�ej!");	
	}	
}
