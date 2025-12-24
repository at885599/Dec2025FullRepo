
public class TestQues {
	public static void main(String[] args) {
			int[] arr= {2,3,5,6,7,8,9,1,2,3,4,5,6};
			int maxLength=1;
			int seqLength=1;
			for(int i=1;i<arr.length;i++) {
				if(arr[i]==arr[i-1]+1) {
					seqLength++;
					maxLength=Math.max(maxLength,seqLength);
				}
				else {
					seqLength=1;
				}
			}System.out.println(maxLength);
		}
}


