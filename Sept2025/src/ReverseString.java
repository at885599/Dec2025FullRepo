
public class ReverseString {
	public static void main(String[] args) {
		String str="Ashish";
		char ch;
		String newStr="";
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			newStr=ch+newStr;
		}
		System.out.println(newStr);
	}

}
