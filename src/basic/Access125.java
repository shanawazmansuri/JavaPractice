package basic;

public class Access125 extends Scooter {

	public Access125(int tyre, int seater) {
		super(tyre, seater);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void engine() {
		System.out.println("Engine 110 CC");		
	}

	@Override
	public void charging() {
		System.out.println("Charging option available");
		
	}

}
