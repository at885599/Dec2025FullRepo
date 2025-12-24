package OOPS;

public class DynamicDispatch {
	public static void main(String[] args) {
		Shape shape;
		
		shape=new Circle();
		shape.draw();
		
		shape=new Square();
		shape.draw();
		
		shape=new Shape();
		shape.draw();
		
	}
}
