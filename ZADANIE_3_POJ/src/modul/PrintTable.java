package modul;

import java.util.Calendar;
import java.util.List;

 public class PrintTable {

	 public static void PrintOutTableWithCars(List<Car> list) {
		 
		System.out.println("=========================================================================================================================================================================================================================");
		System.out.println("|ID \t|Marka\t\t|Model\t\t|VIN \t\t\t|KOLOR \t\t|Rejestracja \t|Data Og³oszenia\t|Rok Produkcji\t|Cena\t\t|Przebieg \t|Tytu³ og³oszenia parafialnego \t\t\t|");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");	
		
		for (Car autko : list) { 
		System.out.println
		( 
			"|"+
			list.indexOf(autko)+ "\t|"+ 
			autko.getBrand() +"\t\t|" +  
			autko.getModel() + "\t\t|" +
			autko.getVin() + "\t|" + 
			autko.getColor() + "\t\t|" +
			autko.getNrRej() +"\t|" + 
			autko.getDataDodania().get(Calendar.DAY_OF_MONTH) + "." + autko.getDataDodania().get(Calendar.MONTH) + "." + autko.getDataDodania().get(Calendar.YEAR) + "\t\t|" + 
			autko.getYearOfProduction() + "\t\t|"+
			autko.getPrice() + "\t\t|" +
			autko.getMileage() + "\t\t|" +
			autko.getTitle() + "\t\t|"
		);
		}
		System.out.println("#######################################################"
				+ "################################################################"
				+ "################################################################"
				+ "###################################");
	 }
 }
