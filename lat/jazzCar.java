package lat;

public class jazzCar extends car {
	
	
	private int price;
	
	
	public jazzCar() {
		// TODO Auto-generated constructor stub
	}

	public jazzCar(int speed, int body) {
		super(speed, body);
		// TODO Auto-generated constructor stub
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public void cheaperThanEver(){
		System.out.println("270jt");
	}	

	

}
