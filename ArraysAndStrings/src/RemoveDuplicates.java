import java.util.Arrays;

public class RemoveDuplicates{
	
	public static void main(String[] args){
		
		String str = "quick brown fox";
		System.out.println(removeDuplicates(str));

	}

	public static String removeDuplicates(String str){
		if(str == null || str.length()  < 2){
			return str;
		}
		int[] arr = new int[256];
		StringBuilder s = new StringBuilder();
		for(int i=0; i < str.length(); i++){
			int x = (int) str.charAt(i);
			if((x^arr[x]) == 0){
				continue;
			}
			arr[x] = x;
			s = s.append(str.charAt(i));
		}
		return s.toString();
	}

}
	
