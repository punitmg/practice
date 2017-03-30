import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class AnagramAlternate{
	public static void main(String[] args){
		String str = "mathemati";
		AnagramAlternate a = new AnagramAlternate();
		long start = new Date().getTime();
		List<String> anagrams = a.generateAnagram("", str);
		long end = new Date().getTime();
		// for(int i=0; i<anagrams.size(); i++){
		// 	System.out.print(" "+anagrams.get(i));
		// }
		// System.out.println();
		System.out.println("Time taken: "+(end-start));
	}

	public List<String> generateAnagram(String prefix, String str){
		if(str.length() == 0){
			List<String> l = new ArrayList();
			l.add(prefix);
			return l;
		}else{
			List<String> l = new ArrayList<>();
			for(int j=0; j<str.length(); j++){
				StringBuilder sb = new StringBuilder(str);
				List<String> l2 = generateAnagram(prefix + str.charAt(j), sb.deleteCharAt(j).toString());
				l.addAll(l2);
			}
			return l;
		}
	}
}