package modul;

import java.util.ArrayList;
import java.util.List;

public class CarGenerator {
	
	private List<Car> allGeneratedCars = new ArrayList<Car>();
	
	public List<Car> getRandomCars(int ileAut){
		String [] marka = {"Audi", "Alfa", "Alpina", "Aston ", "Zi³", "Tatra", "Fisker", "Honda", "Subaru", "Koenig", "Lambo", "Lotus", "VW", "Merc", "Masera", "Mazda", "Porsch", "Seat", "Skoda", "Opel", "Suzuki", "Tata", "Volvo" };
		String [] model = {"A1", "A2", "A3", "A4", "A5", "A6", "TT", "Cobra", "Vectra", "Astra", "126p", "125p", "500xl", "Linea", "Siena", "Zonda", "Fx4", "Conti", "Up", "Passat", "Jetta", "Gofl", "Roomster", "Octavia", "Fabia", "Swift", "Splash", "Nano", "Xc90", "XC70", "V40", "Leon", "Arosa", "Toledo", "Alhambra", "911", "928 Turbo", "Mx 5", "Miata", "Quatr" };
		String [] vin = {"3GCEC13C17G552329", "1FTEF14Y9ELA01485", "2B4FK21G7HR233660", "1G3BN69Y6F9150849", "1HTLDTVN8HHA04016", "1FDYU90XXHVA56000", "2B7FK11R4NR720356", "WVWEU93C76E153409", "1FDZY90S6SVA36346", "1FMDU15Y2DLA02164", "1GTHC29U63E184587", "3GNFC16068G141717", "1HFTE267884753669", "1HD1FS4189Y638673", "1FUJBGAS64DM93729", "WA1DGAFP1EA167678", "1XKDDE9X1MJ591205", "JHLRD78846C093596","3GYVKNEF9AG153669", "1FUYNMDB5VP623404", "1FAHP38391W301126"};
		String [] kolor = {"white", "red", "green", "blue", "mango", "black", "beige", "¿ó³ty", "brown", "pink", "gay", "gray", "silver", "marine", "rocky", "platin", "cocky", "violet", "latte", "sandy", "vomit", "poo"};
		String [] nrRej = {"GD ", "GA ", "GKS ", "GO ", "DO ", "GKW ", "GWE ", "PO ", "WA ", "SU ", "XK ", "RU ", "NBA ", "ZCE ", "WL ", "PPL ", "WI ", "ZS ", "PPI ", "SK " };
		String [] tytu³ = {"Sprzedam chêtnie samochód osobowy", "Oddam w dobre rêce za bezcen", "Sprzedam samochód zadbany 5 drzwiowy", "Oddam samochód rodzina z dziecko", "Pilnie samochód uszkodzony franuski", "Sprzeda¿ auto stan ig³a bezwypadkowy", "Sprzedam samochód sprowadzony z Danii", "Odsprzedam Auto do op³at skarbowych, niebite", "Samochod skreca, odpala, jedzie, hamuje", "Sprzedam auto ma³e bezwypadkowe LPG", "Tylko 120 przebiegu pierwszy w³aœciciel", "Wyj¹tkowa okazja auto sprowadzone", "Pierwszy wlasciciel kobieta sport", "Sprzedaje z powodu wyjazdu kombi", "Zabierz to auto bo mam juz dosc", "Super igla bezwypadkowy z niemiec", "Samochod odpala ale ma problemy z OC", "Zgubilem dokumenty i OC co zrobiæ", "Samochod poezja tylko kupic sobie", "Bezwypadkowy niemalowany wyjatkowy wóz", "Wysmienita gratka dla kolekcjonera", "Samochod od pierwszego wlasciciela", "Sportowy hatchback wlasnie dla Ciebie", "Sprawdz dokladniej opis", "Zapraszam serdecznie do ogladania" };
		
		for(int i=1; i<=ileAut; i++){
			Car nazwa = new Car
					(
						marka[ (int) (Math.random()* 20)], 												//marka z tablicy
						model[ (int) (Math.random()* 20)], 												//model z tablicy
						vin[ (int) (Math.random()* 12)], 												//viny beda sie powtarzac, nie chce mi sie ich generowac automatycznie, bo beda sie rozjezdzac kolumny
						kolor[ (int) (Math.random()* 20)] , 											//kolory z tablicy
						nrRej[ (int) (Math.random()* 20)] + (int) (Math.random()* 999999),				//nrRej bez litery koncowej 
						1 + (int) (Math.random() *31),													//dzien dodania ogloszenia
						1 + (int) (Math.random()* 11), 													//msc dodania ogloszenia
						2018,																			//rok dodania ogloszenia
						1990 + (int) (Math.random()* 28),												//rok produkcji, z za³o¿enia ¿e auta raczej s¹ aktualne wieæ wszystko z 2018r
						15000 + (int) (Math.random()* 15000), 											//ustawiamy cenê auta
						30000 + (int) (Math.random()* 500000),											//przebiegi bêd¹ ró¿ne, ale generalnie wiêksze od 0.
						tytu³[(int) (Math.random()* 25)]
					);
			allGeneratedCars.add(nazwa);
			nazwa.setDateOfAddition();
		}
		System.out.println("Wygenerowano: " + allGeneratedCars.size() + " samochodów. Patrz lista Poni¿ej!");
		return allGeneratedCars; //Metoda zwraca elementy listy, mozna ja klonowac lub przypisac do innej.
	}

	public List<Car> getAllGeneratedCars() {
		return allGeneratedCars;
	}

	public void setAllGeneratedCars(List<Car> allGeneratedCars) {
		this.allGeneratedCars = allGeneratedCars;
	}

	
}
