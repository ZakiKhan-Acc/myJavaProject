/**
 * 
 */
package dataStructure.backtracking;

/**
 * @author zaki
 *
 */
public class Bactracking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//QueenPermutation(new boolean[10],2,0,"");
		//QueenCombination(new boolean[4], 0, 2, 0, "");
		
		int[] arr = {2,3,5,6};
		//CoinCombination(arr, 0, 0, 10, "");
		CoinPermutation(arr, 0, 0, 10, "");

	}
	
	
	
	public static void QueenPermutation(boolean[] boxes,int tq,int qpsf, String ans) {
		if(tq ==qpsf) {
			System.out.println(ans);
		}
		for(int i=0 ; i< boxes.length;i++) {
			if(!boxes[i]) {
			boxes[i]=true;
			QueenPermutation(boxes,tq,qpsf+1, ans+"q"+qpsf+"b"+i);
			boxes[i]=false;
			}
		}
		
	}
	
	public static void QueenCombination(boolean[] boxes,int start,int tq,int qpsf, String ans) {
		if(tq ==qpsf) {
			System.out.println(ans);
		}
		for(int i=start ; i< boxes.length;i++) {
			if(!boxes[i]) {
			boxes[i]=true;
			QueenCombination(boxes,i+1,tq,qpsf+1, ans+"q"+qpsf+"b"+i);
			boxes[i]=false;
			}
		}
		
	}
	
	public static void CoinCombination(int[] arr,int start,int coinSum  ,int endSum, String ans) {
      
		if(coinSum == endSum) {
			System.out.println(ans);
		}
		if(coinSum>endSum) {
			return;
		}
		for(int i=start;i<arr.length;i++) {
			CoinCombination(arr,i,coinSum+arr[i],endSum,ans+arr[i]);
		}
		
	}
	
	public static void CoinPermutation(int[] arr,int start,int coinSum  ,int endSum, String ans) {
	      
		if(coinSum == endSum) {
			System.out.println(ans);
		}
		if(coinSum>endSum) {
			return;
		}
		for(int i=start;i<arr.length;i++) {
			CoinPermutation(arr,0,coinSum+arr[i],endSum,ans+arr[i]);
		}
		
	}

}
