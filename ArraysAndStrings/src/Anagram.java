import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Anagram{
	public static void main(String[] args){
		String str = "mathemati";
		Anagram a = new Anagram();
		long start = new Date().getTime();
		List<String> anagrams = a.generateAnagram(str);
		long end = new Date().getTime();
		// for(int i=0; i<anagrams.size(); i++){
		// 	System.out.print(" "+anagrams.get(i));
		// }
		// System.out.println();
		System.out.println("Time taken: "+(end-start));
	}

	public List<String> generateAnagram(String str){
		if(str.length() == 1){
			List<String> l = new ArrayList();
			l.add(str);
			return l;
		}else{
			List<String> l = new ArrayList<>();
			for(int j=0; j<str.length(); j++){
				StringBuilder sb = new StringBuilder(str);
				List<String> l2 = generateAnagram(sb.deleteCharAt(j).toString());
				for(int k=0; k<l2.size(); k++){
					l.add(str.charAt(j)+l2.get(k));
				}
			}
			return l;
		}
	}
}