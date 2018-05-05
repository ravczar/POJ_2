package filter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import modul.Car;
import modul.CarGenerator;
import modul.PrintTable;

public class AddedDateFilter {
	
	public static void ProvideLowestDate(CarGenerator podaj, GregorianCalendar lowestDate, GregorianCalendar highestDate ) {
		int i=0;
		ArrayList<Car> list = new ArrayList<Car>();
		System.out.println("Szukasz od daty: " + lowestDate.get(Calendar.DAY_OF_WEEK)+"." + lowestDate.get(Calendar.MONTH) + "." + lowestDate.get(Calendar.YEAR)
							+" do Daty: " + highestDate.get(Calendar.DAY_OF_WEEK)+"." + highestDate.get(Calendar.MONTH) + "." + highestDate.get(Calendar.YEAR));
		for (Car car : podaj.getAllGeneratedCars()) {
			if (
					car.getDataDodania().get(Calendar.YEAR) >= lowestDate.get(Calendar.YEAR) && 
					car.getDataDodania().get(Calendar.MONTH) >= lowestDate.get(Calendar.MONTH) &&
					car.getDataDodania().get(Calendar.DAY_OF_WEEK) >= lowestDate.get(Calendar.DAY_OF_WEEK) &&
					car.getDataDodania().get(Calendar.YEAR) >= highestDate.get(Calendar.YEAR) &&
					car.getDataDodania().get(Calendar.MONTH) >= highestDate.get(Calendar.MONTH) &&
					car.getDataDodania().get(Calendar.DAY_OF_WEEK) >= highestDate.get(Calendar.DAY_OF_WEEK)
			    ) 
			{
				list.add(car);
				i++;
			}
		}
		
		PrintTable.PrintOutTableWithCars(list);
		System.out.println("Jest tyle ogloszen dodanych po tej dacie: " + i + ", a tyle jest wszystkich: " + podaj.getAllGeneratedCars().size());	
	}
	

	
}
