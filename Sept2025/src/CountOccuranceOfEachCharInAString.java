import java.util.HashMap;

public class CountOccuranceOfEachCharInAString {
	public static void main(String[] args) {
		String str="This is the string that we need to count";
	}
	public void countCharAppaerence(String str) {
		HashMap<Character,Integer> CharMap=new HashMap<>();
		for(char c:str.toCharArray()) {
			if(Character.isLetter(c)) {
				c=Character.toLowerCase(c);
				CharMap.put(c, CharMap.getOrDefault(c,0)+1);
			}
		}
		for(char key:CharMap.keySet()) {
			System.out.println(key+": "+CharMap.get(key));
		}
	}
}
