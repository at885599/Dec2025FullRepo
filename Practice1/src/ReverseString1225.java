
public class ReverseString1225 {
	public static void main(String[] args) {
		reverseEachWordOfString("Ashish is studying for his interview");
	}
	public static void reverseEachWordOfString(String inputString) {
		String[] words=inputString.split(" ");
		String rstr="";
		for(int i=0;i<words.length;i++) {
			char ch;
			String nstr="";
			String word=words[i];
			for(int j=0;j<word.length();j++){
				ch=word.charAt(j);
				nstr=ch+nstr;
			}rstr=rstr+nstr+" ";
		}System.out.println(rstr);
	}
}
