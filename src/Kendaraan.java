	//Object Oriented Programming
	//1. Inheritance
	//2. Polymorphism
	//3. Encapsulation

	//1. Public
	//2. Private
	//3. Protected
	
	// getter setter = harus private, tidak bisa public
	// shift + alt + s
	
public class Kendaraan {
	private String nama, type, manufacturer;
	private int price, speed;

	public Kendaraan(String nama, String type, String manufacturer, int price, int speed) {
		super();
		this.nama = nama;
		this.type = type;
		this.manufacturer = manufacturer;
		this.price = price;
		this.speed = speed;
	}
	
	public String getNama() {
		return nama;
	}



	public void setNama(String nama) {
		this.nama = nama;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
