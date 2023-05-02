package basic;

public class Condition {

	public static void main(String[] args) {

		Condition con = new Condition();
		// con.case1("Black");
		con.case2(2);

	}

	// ==, =, !, !=,&&, ||,+,<, >
	// else part is default
	// 1==1
	// String == not to use
	// Or condition can be executed if any 1 out of many will be satisfied(true)
	// And Condition can be executed if all out of many will be satisfied (true)

	public void case1(String color) {
		if (color.equals("Green")) {
			System.out.println("Its Green Color");
		} else if (color.equals("Red")) {
			System.out.println("Its a Red Color");
		} else if (color.equals("Yellow") || color.equals("Blue")) {
			System.out.println("Its Yellow or Blue Color");
		}

		else if (color.equals("White") && color.equals("Black")) {
			System.out.println("Its Black and White Color");
		} else {
			System.out.println("Invalid color");
		}
	}

	public void case2(int days) {

		switch (days) {
		case 1:
			System.out.println("Its Sunday");
			break;
		case 2:
			System.out.println("Its Monday");
			break;
		case 3:
			System.out.println("Its Tuesday");
			break;
		case 4:
			System.out.println("Its Wednesday");
			break;
		case 5:
			System.out.println("Its Thursday");
			break;
		case 6:
			System.out.println("Its Friday");
			break;
		case 7:
			System.out.println("Its Saturday");
			break;
		default:
			System.out.println("Invalid Days");

		}

	}

}
