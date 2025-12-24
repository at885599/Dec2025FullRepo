package OopsQues;

public class Car {
	int make;
	String model;
	public Car(int make, String model) {
		this.make=make;
		this.model=model;
	}
	public void alto() {
		System.out.println("This is a "+make+ " make");
		System.out.println("This is a "+model+ " model");
	}
}
