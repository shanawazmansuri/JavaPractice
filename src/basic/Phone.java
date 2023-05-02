package basic;

public interface Phone extends OldPhone {
	
	//Interface is blueprint of class
	// 100% abstraction
	//Interface method will be by default public
	// You can create the variable and needs to initalise it
	// By default variable will be public static and final
	// Code reutilization
	// We cannot create the object of an interface
	// We cannot create a constructor
	// You can create an reference object of interface
	// You can create multiple inhertance and implemetation
	
	String APPLEBRAND = "APPLE";
	String SAMSUNGBRAND = "SAMSUNG";
	
	
	 void brandName();
	 void calling();
	 void message();
	 void frontCam();
	 void backCam();
	 void conf();
	 void platform();
	
	
	

}
