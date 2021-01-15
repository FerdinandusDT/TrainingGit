
public class Motor extends Kendaraan{
	
	private int seatcount;


	public Motor(String nama, String type, String manufacturer, int price, int speed, int seatcount) {
		super(nama, type, manufacturer, price, speed);
		this.seatcount = seatcount;
	}
	
	public int getSeatcount() {
		return seatcount;
	}



	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}



}
