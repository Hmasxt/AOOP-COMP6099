package lat;

public class supraCar extends car{
	
	private int specialGas;
	
	public supraCar(int speed, int body,int specialGas) {
		super(speed, body);
	}
	
	
	public int getSpecialGas() {
		return specialGas;
	}


	public void setSpecialGas(int specialGas) {
		this.specialGas = specialGas;
	}
	
	
	public void nGas(int specialGas){
		System.out.println("supraCar > car"); 
	}
	

}
