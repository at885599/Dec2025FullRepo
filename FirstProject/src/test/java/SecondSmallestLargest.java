
public class SecondSmallestLargest {

	public static void main(String[] args) {
		int[] arr= {1,2,4,7,5,7};
		/*if(arr==null || arr.length<2) {
			System.out.println("Second smallest: -1");
			System.out.println("Second smallest: -1");
		}*/
		int secondLargest=findSecondLargest(arr);
		System.out.println(secondLargest);
		int secondSmallest=findSecondSmallest(arr);
		System.out.println(secondSmallest);
		}
	public static int findSecondLargest(int[] arr) {
		if(arr.length<2) return -1;
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int n:arr) {
			if(n>max) {
				secondMax=max;
				max=n;
			}else if(n> secondMax && n !=max) 
			{
				secondMax=n;
			}
		}
		return(secondMax==Integer.MIN_VALUE)?-1:secondMax;
	}
	public static int findSecondSmallest(int[] arr) {
		if(arr.length<2)return -1;
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		for(int n:arr) {
			if(n<min) {
				secondMin=min;
				min=n;
			}else if(n<secondMin && n!=min) {
				secondMin=n;
			}
		}
		return(secondMin==Integer.MAX_VALUE)? -1: secondMin;
	}
}

/*Given an array, find the second smallest and second largest element in the array.
 
Print ‘-1’ in the event that either of them doesn’t exist.
 
Constraint 1: You are NOT allowed to sort the array in any way.
 
Constraint 2: There may be duplicates in the array.
 
Constraint 3: You can have an empty array(print -1 in that case) as well as an array with negative numbers
 
Example 1:

Input: [1,2,4,7,7,5]

Output: Second Smallest : 2

Second Largest : 5

Explanation: The elements are as follows 1,2,4,5,7,7 and hence second largest of these is 5 and second smallest is 2.
 
Example 2:

Input: [2]

Output: Second Smallest : -1

Second Largest : -1

Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 */
