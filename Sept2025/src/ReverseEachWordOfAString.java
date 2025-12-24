
public class ReverseEachWordOfAString {
	public static void main(String[] args) {
		String str="Ashish is learning how to get a job in automation";
		String[] words=str.split(" ");
		
		String revString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String newStr="";
			char ch;
			for(int j=0;j<word.length();j++) {
				ch=word.charAt(j);
				newStr=ch+newStr;
			}revString=revString+newStr+" ";
		}System.out.println(revString);
	}
}
