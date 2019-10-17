package lat;

public class car {
	
	private int speed;
	private int body;

	
	public car() {
		super();
		// TODO Auto-generated constructor stub
	
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	
	public car (int speed, int body){
		this.speed=speed;
		this.body=body;
	}
	
	public void tekenGAS(int wuss){
		if(wuss > 100){
			System.out.println("wusssss");
		}
		else
		System.out.println("wus");
//		speed += wuss;
	}
	public void rem(int citt){
		if(citt == 0){
			System.out.println("diam");
		}
		else
			System.out.println("jalan");
//		speed -= citt;
	}
	
	
	
	
}
