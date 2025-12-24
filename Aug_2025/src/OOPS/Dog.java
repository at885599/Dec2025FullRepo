package OOPS;
public class Dog extends Animal{
	public void sound() {
		System.out.println("abstract method");		
	}
	public static void main(String[] args) {
		Dog myObj=new Dog();
		myObj.sound();
		myObj.eat();
		
	}
	private int i;
	private String str="India is great";
	public void seti(int i) {
		System.out.println(i);
	}
	public String getstr() {
		return str;
	}
}