import java.util.Stack;

class Solution {
    boolean solution(String s) {
	Stack<String> stack = new Stack<>();   
        
    //1. 세트가 맞아야 한다 ()
    //2. 항상 ")" 가 "(" 보다 많으면 안됨    
	for(int i = 0; i < s.length(); i++) {
		if(s.charAt(i)==')') {
			if(stack.isEmpty()) {
                return false;  
            } 
            if(!stack.pop().equals("(")) {
                return false;   
            }
		} else {
                stack.push("(");
            }
		}
        if(stack.isEmpty()) {
          return true;  
        } 
		return false;
	}
}