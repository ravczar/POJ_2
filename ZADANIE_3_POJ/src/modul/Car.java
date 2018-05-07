package modul;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Car implements Comparable<Car> { 

	private final String model;
	private final String brand;
	private final String vin;
	private final String color;
	private final String nrRej;
	private int price;
	private final String title;
	private final int milage; 
	private final int yearOfProduction;
	  private int addDay;
	  private int addMonth;
	  private int addYear;
	private GregorianCalendar dataDodania = new GregorianCalendar(); 

//// KONSTRUKTOR KLASY CAR	
	public Car(String marka, String model, String vin, String color, String nrRej, int dzienOgloszenia, int miesiacOgloszenia, int rokOgloszenia, int rokProdukcji, int cena, int przebieg, String tytu³) {
		super();
		this.brand = marka;
		this.model = model;
		this.vin = vin;
		this.color = color;
		this.nrRej = nrRej;
		this.addDay = dzienOgloszenia;
		this.addMonth = miesiacOgloszenia;
		this.addYear = rokOgloszenia;
		this.yearOfProduction = rokProdukcji;
		this.price = cena;
		this.milage = przebieg;
		this.title = tytu³;	
	}
//// METODY	
	public void setDateOfAddition() {
		dataDodania.set(Calendar.YEAR, addYear); 
		dataDodania.set(Calendar.MONTH, addMonth);
		dataDodania.set(Calendar.DAY_OF_MONTH, addDay);
	}		

	public String getColor() {
		return color;
	}
	public String getNrRej() {
		return nrRej;
	}
	public String getModel() {
		return model;
	}
	public String getBrand() {
		return brand;
	}
	public String getVin() {
		return vin;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMileage() {
		return milage;
	}
	public String getTitle() {
		return title;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public GregorianCalendar getDataDodania() {
		return dataDodania;
	}
	
/*
* Domyœlne sortowanie wyników po "Collections.sort(list);" odbêdzie siê po cenie -> Wyst³maczone na:  https://www.mkyong.com/java8/java-8-lambda-comparator-example/
* @see java.lang.Comparable#compareTo(java.lang.Object)
*/
	@Override  
	public int compareTo(Car compareCar) {
		
		int comparePrice = ((Car) compareCar).getPrice(); 
			//ascending order
			return this.price - comparePrice;
			//descending order
			//return comparePrice - this.price;
	}
}
