class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] str = n_str.split("");
        
        int index = 0;
        while (str[index].equals("0")) {
            index++;
        }
        
        for (int i = index; i < str.length; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}