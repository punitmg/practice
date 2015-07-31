package boggle;

public class Boggle {

	public static void main(String[] args){
		char[][] arr = new char[][]{
				{'f','n','i','t'},
				{'g','o','u','n'},
				{'t','u','u','u'},
				{'t','u','p','p'}
		};
		
		String word = "punit";
		
		boolean res = solve(arr, word);
		System.out.println("\n"+res);
	}

	private static boolean solve(char[][] arr, String word) {
		
		boolean found = false;
		for(int i=0; i<arr.length; i++){
			
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+" ");
				if(arr[i][j] == word.charAt(0)){
					boolean[][] marked = new boolean[arr.length][arr.length];
					marked[i][j] = true;
					found = findWord(i, j, 1, word, arr, marked);
					if(found){
						return true;
					}
				}
			}
			
			System.out.println();
		}
		return false;
	}

	
	// find k-th character in word starting from arr[i][j]
	private static boolean findWord(int i, int j, int k, String word, char[][] arr, boolean[][] marked) {
		if(k == word.length()){
			return true;
		}else{
			//System.out.println(" <i"+i+" j"+j+" "+arr[i][j]+" looking for "+word.charAt(k)+">");
			// for each potential set of positions, iterate to find next characters

			int lowerI, upperI, lowerJ, upperJ;
			if(i==0){
				lowerI = 0;
				upperI = i + 1;
			}else{
				lowerI = i - 1;
				if(i == arr.length-1){
					upperI = arr.length - 1;
				}else{
					upperI = i + 1;
				}
			}
			
			if(j == 0){
				lowerJ = 0;
				upperJ = j + 1;
			}else{
				lowerJ = j - 1;
				if(j == arr.length-1){
					upperJ = arr.length - 1;
				}else{
					upperJ = j + 1;
				}
			}
			
			boolean wordFound = false;
			// get the 8 neighbours, put the matching next chars in a queue
			for(int x=lowerI; x<=upperI; x++){
				
				for(int y=lowerJ; y<=upperJ; y++){
					if(arr[x][y] == word.charAt(k) && !(x == i && y == j) && !marked[x][y]){
						marked[x][y] = true;
						wordFound = findWord(x, y, k+1, word, arr, marked);
						if(wordFound){
							return true;
						}else{
							marked[x][y] = false;
						}
					}
				}
			}
			
			return false;
		}
	}
}
