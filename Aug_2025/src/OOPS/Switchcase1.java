package OOPS;
import java.util.Scanner;

public class Switchcase1 {
	public static void main(String[] args) {
		System.out.println(Switchcase1.pos());
		int marks=65;
		switch (marks/10) {
		case 10: System.out.println("Grade A");break;
		case 9: System.out.println("Grade A");break;
		case 8: System.out.println("Grade B");break;
		case 7: System.out.println("Grade C");break;
		case 6: System.out.println("Grade D");break;
		case 5: System.out.println("Grade E");break;
		default:System.out.println("Grade F");break;
		}
		
	}
	public static String pos() {
		String n;
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the marks obtained");
		int marks=myObj.nextInt();
		if(marks>1) {
			n=("number is positive");}
		else if(marks<0) {
			n=("number is negative");}
		else {
			n=("number is zero");}
		return n;
	}

}
