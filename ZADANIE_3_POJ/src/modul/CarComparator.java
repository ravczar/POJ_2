package modul;

import java.util.Comparator;
import java.util.GregorianCalendar;

public class CarComparator {

	/// PIERWSZY KOMPARATOR - Po: Tytule Og³oszenia "$title"
	public static Comparator<Car> CarTitleComparator = new Comparator<Car>() {
	    
		public int compare(Car car1, Car car2) {
	      String title_1 = car1.getTitle().toUpperCase();
	      String title_2 = car2.getTitle().toUpperCase();
	      	//set ascending order
	      	return title_1.compareTo(title_2);
	      	//set descending order
	      	//return title_2.compareTo(title_1);
	    }

	};
	
	// DRUGI KOMPARATOR - Po: Cenie "price"
	public static Comparator<Car> CarPriceComparator = new Comparator<Car>() {

	    public int compare(Car car1, Car car2)
	    {
	    	// ORDER ASCENDING
	        return car1.getPrice() - car2.getPrice();
	        // ORDER DESCENDING
	        //return car2.getPrice() - car1.getPrice();
	    }
	};		
	
	// TRZECI KOMPARATOR - Po: Roku produkcji "yearOfProduction"
	public static Comparator<Car> CarYearOfProductionComparator = new Comparator<Car>() {
		
	    public int compare(Car car1, Car car2)
	    {
	    	// ORDER ASCENDING
	         return car1.getYearOfProduction() - car2.getYearOfProduction();
	        // ORDER DESCENDING
	        // return car2.getYearOfProduction() - car1.getYearOfProduction();
	    }
	};	
	
	// CZWARTY KOMPARATOR - Po: Dacie dodania "addDate"
	public static Comparator<Car> CarAddDateComparator = new Comparator<Car>() {

	    public int compare(Car car1, Car car2)
	    {
		      GregorianCalendar carAddDate1 = car1.getDataDodania();
		      GregorianCalendar carAddDate2 = car2.getDataDodania();
		      	//ascending order
		      	return carAddDate1.compareTo(carAddDate2);
		      	//descending order
		      	//return carAddDate2.compareTo(carAddDate1);
	    }
	};	
	
	// PIATY KOMPARATOR - Po: Marce auta "brand"
	public static Comparator<Car> CarBrandComparator = new Comparator<Car>() {

	    public int compare(Car car1, Car car2)
	    {
		      String carBrand_1 = car1.getBrand().toUpperCase();
		      String carBrand_2 = car2.getBrand().toUpperCase();
		      	//ascending order
		      	return carBrand_1.compareTo(carBrand_2);
		      	//descending order
		      	//return carBrand_2.compareTo(carBrand_1);
	    }
	};	
	
	// SZÓSTY KOMPARATOR - Po: Model auta "model"
	public static Comparator<Car> CarModelComparator = new Comparator<Car>() {

	    public int compare(Car car1, Car car2)
	    {
		      String carModel_1 = car1.getModel().toUpperCase();
		      String carModel_2 = car2.getModel().toUpperCase();
		      	//ascending order
		      	return carModel_1.compareTo(carModel_2);
		      	//descending order
		      	//return carModel_2.compareTo(carModel_1);
	    }
	};	
	
	// SIÓDMY KOMPARATOR - Po: Nr.Rej auta "nrRej"
	public static Comparator<Car> CarRegistryNumberComparator  = new Comparator<Car>() {
	
	    public int compare(Car car1, Car car2)
	    {
		      String carRegistryNO_1 = car1.getNrRej().toUpperCase();
		      String carRegistryNO_2 = car2.getNrRej().toUpperCase();
		      	//ascending order
		      	return carRegistryNO_1.compareTo(carRegistryNO_2);
		      	//descending order
		      	//return carRegistryNO_2.compareTo(carRegistryNO_1);
	    }
	};	
	
	// ÓSMY KOMPARATOR - Po: Przebiegu auta "mileage"
	public static Comparator<Car> CarMileageComparator = new Comparator<Car>() {

	    public int compare(Car car1, Car car2)
	    {
	    	// ORDER ASCENDING
	        //return car1.getMileage() - car2.getMileage() ;
	        // ORDER DESCENDING
	        return car2.getMileage() - car1.getMileage();
	    }
	};	
	
} //END CLASS
