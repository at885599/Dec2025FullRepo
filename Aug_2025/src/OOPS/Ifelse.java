package OOPS;

public class Ifelse {
	public static void main(String[] args) {
		Ifelse newObj=new Ifelse();
		float bm=newObj.bmi();
		int a=4;
		int b=3;
		if(bm>18.5 && bm<24.9) {
			if(a==4) {System.out.println("sahi hai BMI");}
			else{System.out.println("mota hai");}
		}
		else {System.out.println("b is greater than a, still motu");}
	}
	public static float bmi() {
		float w=72;
		float h=1.8f;
		float b=w/(h*h);
		return b;
	}
}
