public class AllUniqueChars{
	
	public static void main(String[] args){
		String a = "quickbrownw";
		System.out.println(hasAllUniqueChars(a));
	}

	public static boolean hasAllUniqueChars(String a){
		int[] arr = new int[256];
		for(int i=0; i<a.length(); i++){
			int x = (int)a.charAt(i);
			if((x ^ arr[x]) == 0){
				return false;
			}
			arr[x] = x;
		}
		return true;
	}
}
