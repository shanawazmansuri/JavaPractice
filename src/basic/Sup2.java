package basic;

public class Sup2 extends Sup1 {

	Sup2() {
		super(11,12);
		System.out.println("Child Class Default Cons "+super.age);
	}
	
	Sup2(int a, int b) {
		super(11);
		System.out.println("Child Class 2 Param Cons");
	}
	
	Sup2(String a, String b) {
		super(11, "Shanawaz");
		System.out.println("Child Class 2 Param Different Cons");
	}

	public static void main(String[] args) {

		// Super kw is related to super/parent class object
		// Super fetch parent class variables, Methods and Constructor to sub class

		Sup2 sp = new Sup2();
		//sp.test1();

	}

	public void test1() {
		super.case1();
		System.out.println("Child test 1");
	}

	public void test2() {
		System.out.println("Child test 2");
	}

}
