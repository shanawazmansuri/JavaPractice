package basic;

public class Samsung implements Phone,UltraSmartPhone {
	
	public static void main(String[] args) {
		
		Phone sa = new Samsung();
		sa.brandName();
		sa.conf();
		
	}

	@Override
	public void calling() {
		
		System.out.println("Samsung calling method");
		
	}

	@Override
	public void message() {
		System.out.println("Samsung message method");
		
	}

	@Override
	public void frontCam() {
		System.out.println(" 2 front cameras");
		
	}

	@Override
	public void backCam() {
		
		System.out.println("3 Back camera");
	}

	@Override
	public void conf() {
		System.out.println(" 6 GB Ram and 770 Snapdragon");
		
	}

	@Override
	public void platform() {
		System.out.println("Android Platform");
		
	}

	@Override
	public void brandName() {
		System.out.println("Brand Name is "+Phone.SAMSUNGBRAND);
		
	}

	@Override
	public void keyPad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dynamicIsland() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WirelessCharging() {
		// TODO Auto-generated method stub
		
	}
	
	//1000 methods
	//2500 line of code
	
	
	

}
