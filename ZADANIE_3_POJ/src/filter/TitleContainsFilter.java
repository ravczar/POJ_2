package filter;

import java.util.ArrayList;
import modul.Car;
import modul.CarGenerator;
import modul.PrintTable;

public class TitleContainsFilter {

	public static void ProvideWordToSeek(CarGenerator podaj, String yourWord ) {
		int i=0;
		ArrayList<Car> list = new ArrayList<Car>();
		System.out.println("Szukasz wtytu�ach s�owa: "+ "#"+yourWord + "#");
		for (Car car : podaj.getAllGeneratedCars()) {
			if ( car.getTitle().contains(yourWord) ) 
			{
				list.add(car);
				i++;
			}
		}
		PrintTable.PrintOutTableWithCars(list);
		System.out.println("Tyle jest tytu��w zawieraj�cych to s�owo: " + i + ", a tyle jest wszystkich og�osze�: " + podaj.getAllGeneratedCars().size());	
	}
	
}
