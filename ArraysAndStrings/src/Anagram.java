import java.util.List;
import java.util.ArrayList;

public class Anagram{
	public static void main(String[] args){
		String str = "math";
		Anagram a = new Anagram();
		List<String> anagrams = a.generateAnagram(str);
		for(int i=0; i<anagrams.size(); i++){
			System.out.print(" "+anagrams.get(i));
		}
		System.out.println();
	}

	public List<String> generateAnagram(String str){
		if(str.length() == 1 || str.length() == 0){
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