
public class Mobil extends Kendaraan{

	private int doorcount, speakercount;
	private String speakertype;
	
	public Mobil(String nama, String type, String manufacturer, int price, int speed, int doorcount, int speakercount,
			String speakertype) {
		super(nama, type, manufacturer, price, speed);
		this.doorcount = doorcount;
		this.speakercount = speakercount;
		this.speakertype = speakertype;
	}
	
	public int getDoorcount() {
		return doorcount;
	}


	public void setDoorcount(int doorcount) {
		this.doorcount = doorcount;
	}


	public int getSpeakercount() {
		return speakercount;
	}


	public void setSpeakercount(int speakercount) {
		this.speakercount = speakercount;
	}


	public String getSpeakertype() {
		return speakertype;
	}


	public void setSpeakertype(String speakertype) {
		this.speakertype = speakertype;
	}

}
