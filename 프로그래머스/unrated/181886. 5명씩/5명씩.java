class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[((names.length - 1) / 5) + 1];
        // System.out.println(answer.length);
        
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[i / 5] = names[i];
            } else {
                continue;
            }
        }       
        
        return answer;
    }
}