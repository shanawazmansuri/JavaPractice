package basic;

public class Apple implements Phone,UltraSmartPhone {
	
	public static void main(String[] args) {
		
		Apple ap = new Apple();
		ap.brandName();
		ap.backCam();
		
	}

	@Override
	public void calling() {
		System.out.println("Apple calling method...");		
	}

	@Override
	public void message() {
		System.out.println("Apple messaging method...");
		
	}

	@Override
	public void frontCam() {
		System.out.println("Single front camera");
		
	}

	@Override
	public void backCam() {
		System.out.println("Simple verison 2 camera");
		
	}

	@Override
	public void conf() {
		System.out.println("12 GB ram and xyz processor");
		
	}

	@Override
	public void platform() {
		System.out.println("Platform is ios");
		
	}

	@Override
	public void brandName() {
		
		System.out.println("Brand name is "+Phone.SAMSUNGBRAND);
		
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

}
