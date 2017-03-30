import java.util.Arrays;

public class MergeSort{
	public static void main(String[] args){
		int[] input = new int[]{34, 3, 5, 19, 44, 1, 11, 0, 3};
		MergeSort m = new MergeSort();
		int[] sorted = m.sort(input);
		for(int i=0; i<sorted.length; i++){
			System.out.print(" "+sorted[i]);
		}
		System.out.println();
	}

	public int[] sort(int[] input){
		int len = input.length;
		if(len > 1){
			int[] left = sort(Arrays.copyOfRange(input, 0, len/2));
			int[] right = sort(Arrays.copyOfRange(input, len/2, len));
			int[] sorted = merge(left, right);
			// System.out.println("sorted");
			// for(int i=0; i<sorted.length; i++){
			// 	System.out.print(" "+sorted[i]);
			// }
			// System.out.println();
			return sorted;
		}else{
			return input;
		}
	}

	public int[] merge(int[] left, int[] right){
		int leftCounter = 0;
		int rightCounter = 0;
		int[] result = new int[left.length + right.length];
		int index = 0;
		while(leftCounter < left.length && rightCounter < right.length){
			if(left[leftCounter] > right[rightCounter]){
				result[index++] = right[rightCounter];
				rightCounter++;
			}else{
				result[index++] = left[leftCounter];
				leftCounter++;
			}
		}

		while(leftCounter < left.length){
			result[index++] = left[leftCounter++];
		}

		while(rightCounter < right.length){
			result[index++] = right[rightCounter++];
		}
		return result;
	}
}