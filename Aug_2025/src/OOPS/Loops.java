package OOPS;

public class Loops {
	public static void main(String[] args) {
		int sum=0;
		int j=51;
		for(int i=0;i<j;i++) {
			sum=i+sum;
		}System.out.println(sum);
		Loops.dwloop();
		Loops.wloop();
	}
	public static int dwloop() {
		int i=1;
		int  sum1=0;
		do {
			sum1=sum1+i;
			i++;}
		while(i<51);
		System.out.println("this is do while loop " + sum1);
		return sum1;
	}
	public static int wloop() {
		int i=1;
		int  sum2=0;
		while(i<51) {
			sum2=sum2+i;
			i++;}
		System.out.println("this is do while " + sum2);
		return sum2;
	}
}
	