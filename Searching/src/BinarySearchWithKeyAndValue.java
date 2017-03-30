package binarysearch;

public class BinarySearchWithKeyAndValue {

	public static void main(String[] args){
		int[] arr = new int[]{1,25,3,14, 2,6,7,8, 5,34,3434,0, 8,1,2,3};
		int subLen = 4;
		System.out.println(search(arr, subLen, 0, arr.length - subLen, 3));
	}

	public static boolean search(int[] arr, int subLen, int low, int high, int value){
		int arrLen = (high+subLen) - low;
		int keysLen = arrLen / subLen;
		int mid = keysLen / 2;
		int midIndex = (mid * subLen) + low;
		System.out.println("mid index "+midIndex);
		if(high < low){
			System.out.println("High:"+high+" low:"+low);
			return false;
		}else if(arr[midIndex] == value){
			return true;
		}else if(arr[midIndex] > value){
			return search(arr, subLen, low, midIndex - subLen, value);
		}else{
			return search(arr, subLen, midIndex + subLen, high, value);
		}
	}
}

