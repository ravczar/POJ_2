package application;

import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;

import comparators.PriceComparator;
import comparators.RegistryNumberComparator;
import comparators.TitleComparator;
import comparators.YearOfProductionComparator;
import comparators.AddDateComparator;
import comparators.BrandComparator;
import comparators.ICanFilter;
import comparators.MIleageComparator;
import comparators.ModelComparator;
import filter.AddedDateFilter;
import filter.MIleageFilter;
import filter.PriceFilter;
import filter.TitleFilter;
import modul.CarGenerator;
import modul.PrintTable;
public class Main {
	public static void main(String[] args) {	
	// Tworzymy nowa instancje Interfejsu.
		ICanFilter filterek1 = new TitleComparator(); 									
		ICanFilter filterek2 = new PriceComparator();									
		ICanFilter filterek3 = new YearOfProductionComparator();
		ICanFilter filterek4 = new RegistryNumberComparator();
		ICanFilter filterek5 = new ModelComparator();
		ICanFilter filterek6 = new MIleageComparator();
		ICanFilter filterek7 = new BrandComparator();
		ICanFilter filterek8 = new AddDateComparator();
		
	// Deklarujemy jak bedziemy sortowaæ ASCENDING / DESCENDING
		filterek1.howToSort("ASC");
		filterek2.howToSort("DESC"); 
		filterek3.howToSort("ASC");
		filterek4.howToSort("ASC");
		filterek5.howToSort("ASC");
		filterek6.howToSort("DESC");
		filterek7.howToSort("ASC");
		filterek8.howToSort("ASC");
	
	// Tworzymy liste 40 aut za pomoc¹ generatora
		CarGenerator start = new CarGenerator();
		start.getRandomCars(40);
	// Domyœlnie w klasie  Car jest ustawione sortowanie po cenie ASCENDING.
		Collections.sort(start.getAllGeneratedCars());  		
		PrintTable.PrintOutTableWithCars(start.getAllGeneratedCars());
	// Filtruj po cenie 20-30k, sortuj uzyskany wynik po cenie malej¹co
		PriceFilter.ProvideLowesAndHighestPrice(start, 20000, 30000);
		Collections.sort(PriceFilter.getAllFilteredCars(), PriceComparator.Compare);
		PrintTable.PrintOutTableWithCars(PriceFilter.getAllFilteredCars());
	// Filtruj po tytu³ach "samochód", sortuj po dacie dodania
		TitleFilter.ProvideWordToSeek(start, "samochód");
		Collections.sort(TitleFilter.getAllFilteredCars(), AddDateComparator.Compare);
		PrintTable.PrintOutTableWithCars(TitleFilter.getAllFilteredCars());
	// Filtruj po przebiegu , sortuj po roku produkcji
		MIleageFilter.PrivideLowestAndHighestMileage(start, 20000, 150000);
		Collections.sort(MIleageFilter.getAllFilteredCars(), YearOfProductionComparator.Compare);
		PrintTable.PrintOutTableWithCars(MIleageFilter.getAllFilteredCars());
	// Filtruj po daciedodania, sortuj po modelu
		AddedDateFilter.ProvideLowestDate(start, new GregorianCalendar(2018,Calendar.MAY, 01), new GregorianCalendar(2018,Calendar.OCTOBER,01));
		Collections.sort(AddedDateFilter.getAllFilteredCars(), ModelComparator.Compare);
		PrintTable.PrintOutTableWithCars(AddedDateFilter.getAllFilteredCars());

	}
}