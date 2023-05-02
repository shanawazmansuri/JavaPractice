package basic;

public class Encap {

	private int accNo; //123456
	private int atmPin;
	private String accHolderName;

	//Getter
	public int getAccNo() {
		return accNo;
	}

	//Setter
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public static void main(String[] args) {
		// Encapsulation is machansim to wrap variable and its member within class
		// Variable as private
		// class method public
		// Getter Setter is used to utilize the private members

	}

}
