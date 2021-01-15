import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		Kendaraan ken = new Kendaraan("mycar", "avanza", "toyota", 1000000, 100);
//		System.out.println(ken.getManufacturer());
//		ken.setManufacturer("honda");
//		System.out.println(ken.getManufacturer());
//		
//		Scanner scan = new Scanner(System.in);
//		String nama;
//		nama = scan.nextLine();
//		
//		ken.setNama(nama);
//		System.out.println(ken.getNama());
		
//		Mobil car = new Mobil("myCar1", "Xenia", "Daihatsu", 10000000, 120, 4, 1, "Stereo");
//		System.out.println(car.getNama());
//		System.out.println(car.getSpeakercount());
//		car.setNama("Car1");
//		System.out.println(car.getNama());
//		
//		Motor tor = new Motor ("myMotorcycle1", "Ninja", "Kawasaki", 23000000, 150, 2);
//		System.out.println(tor.getNama());
//		System.out.println(tor.getSeatcount());
		
//		Vector<Mobil> cars = new Vector<>();
//		cars.add(new Mobil("myCar1", "Xenia", "Daihatsu", 10000000, 120, 4, 1, "Stereo"));
//		
//		System.out.println(cars.get(0).getNama());
		
		Vector <Kendaraan> kendaraan = new Vector<>();
		kendaraan.add(new Mobil("myCar1", "Xenia", "Daihatsu", 10000000, 120, 4, 1, "Stereo"));
		kendaraan.add(new Motor("myMotorcycle1", "Ninja", "Kawasaki", 23000000, 150, 2));
		
//		System.out.println(kendaraan.get(0).getNama());
		System.out.println(((Mobil)kendaraan.get(0)).getNama());
		System.out.println(((Motor)kendaraan.get(1)).getNama());
		
		((Motor)kendaraan.get(1)).setNama("Motor1");
		System.out.println(((Motor)kendaraan.get(1)).getNama());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();

	}

}
