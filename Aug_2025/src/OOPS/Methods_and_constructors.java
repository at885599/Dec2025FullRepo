package OOPS;

public class Methods_and_constructors {
	public static void main(String[] args){
		System.out.println("Hello world");
		Methods_and_constructors myObj=new Methods_and_constructors();
	}
	
	public Methods_and_constructors(){
		System.out.println("constructor called");
	}
}

/*A constructor is a special block of code that is automatically called when an object of the class is created.

It must have the same name as the class.

It cannot have a return type (not even void).

It cannot be static, final, or abstract.

Its purpose is to initialize objects.*/