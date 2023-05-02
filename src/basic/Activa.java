package basic;

public class Activa extends Scooter {

	
	public Activa()
	{
		super();
		
	}


	public Activa(int tyre, int seater) {
		super(tyre, seater);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Activa ac = new Activa(2,3);
		ac.type();
		ac.tyres();
		ac.engine();
		ac.charging();
		ac.speed();
		
		Activa act = new Activa();
		
		

	}

	@Override
	public void engine() {
		System.out.println("Engine is 100 CC");		
	}

	@Override
	public void charging() {
		System.out.println("Chaging option available");
		
	}

}
