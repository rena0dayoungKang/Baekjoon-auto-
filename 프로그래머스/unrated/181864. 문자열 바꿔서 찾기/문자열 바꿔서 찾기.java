class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        //replaceAll  
        String AtoC = myString.replaceAll("A","C");
        String BtoA = AtoC.replaceAll("B","A");
        String BtoC = BtoA.replaceAll("C","B");
        
        if (BtoC.contains(pat)){
            answer = 1;
        } else {
            answer = 0;
        }
            
        
        return answer;
    }
}