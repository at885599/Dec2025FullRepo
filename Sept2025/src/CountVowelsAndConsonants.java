import java.util.ArrayList;
import java.util.Comparator;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		int arr[]= {11,49,76,58,47,8};
		ArrayList<Integer> a=new ArrayList<>();
		for(int i: arr) {
			a.add(i);
		}
		a.sort(Comparator.naturalOrder());
		for(int j: a) {
			System.out.println(j);
		}
	}
}
