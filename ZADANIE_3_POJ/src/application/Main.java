package application;

import java.util.Collections;

import modul.CarComparator;
import modul.CarGenerator;
import modul.PrintTable;
public class Main {
	public static void main(String[] args) {	
/*
 	* 
	 * Generowanie zwyklej tabeli zaplutej wskazan¹ liczb¹ rekordów - tu przyk³¹dowo 40 sztuk
	 	* 1) start.getAllGeneratedCars() zwraca nam Listê <Car>
	 	* 2) w CarComparator mamy wszystkie Comparatory i do nich odnosimy siê przez Collecion.sort
	 	* 3) PrintTable tylko wyrzuca na ekran nasze dane w postaci tabeli
	* 
*/
		CarGenerator start = new CarGenerator();
		start.getRandomCars(40);
		Collections.sort(start.getAllGeneratedCars(), CarComparator.CarModelComparator);
		PrintTable.PrintOutTableWithCars(start.getAllGeneratedCars());
		
/*
 	* Mo¿liwe filtry do wybrania:
 */
		//PriceFilter.ProvideLowesAndHighestPrice(start, 20000, 30000);
		//DateOfProdFilter.PrivideBottomAndTopYear(start, 2000, 2011);
		//AddedDateFilter.ProvideLowestDate(start, new GregorianCalendar(2018,Calendar.MAY, 01), new GregorianCalendar(2018,Calendar.OCTOBER,01));
		//MIleageFilter.PrivideLowesAndHighestMileage(start, 100000, 200000);
		//TitleContainsFilter.ProvideWordToSeek(start, "samochód");
		
	}
}