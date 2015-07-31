package stacks;

import java.util.Stack;

public class BalancedString {
	public static void main(String[] args){
		String str = "((((())))){}";
		boolean isBalanced = isBalanced(str);
		System.out.printf("Is %s Balanced: %s",str,isBalanced);
	}
	
	public static boolean isBalanced(String str){
		Stack<Character> braceStack = new Stack<Character>();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == '{' || 
					str.charAt(i) == '[' || 
					str.charAt(i) == '(' ){
				braceStack.push(str.charAt(i));
			}
			
			if(str.charAt(i) == '}'){
				if(braceStack.pop() != '{'){
					return false;
				}
			}
			
			if(str.charAt(i) == ']'){
				if(braceStack.pop() != '['){
					return false;
				}
			}
			
			if(str.charAt(i) == ')'){
				if(braceStack.pop() != '('){
					return false;
				}
			}
		}
		
		if(braceStack.size() != 0){
			return false;
		}else{
			return true;
		}
	}
}
