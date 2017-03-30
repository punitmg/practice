package binarysearch;

public class BasicBinarySearch {

	public static void main(String[] args){
		int[] arr = new int[]{1,3,5,6,7,9,12,435};
		System.out.println(search(arr, 7, 0, arr.length-1));
	}
	
	public static boolean search(int[] arr, int value, int low, int high){
		
		if(low > high){
			return false;
		}else{
			int mid = (high + low) / 2;
			if(arr[mid] == value){
				return true;
			}else if(arr[mid] > value){
				return search(arr, value, low, mid-1);
			}else{
				return search(arr, value, mid+1, high);
			}
		}
		
	}
}
