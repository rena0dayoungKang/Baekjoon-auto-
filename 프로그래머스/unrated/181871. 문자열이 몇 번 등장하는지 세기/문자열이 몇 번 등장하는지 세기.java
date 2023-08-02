class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        //1. substring을 pat길이만큼 자르기
        int n = pat.length();  //3
        for (int i = 0; i <= myString.length() - n; i++) {
            String tmp = myString.substring(i, i + n);
            System.out.println(tmp);
            //2. pat와 equals라면 count를 증가
            if (tmp.equals(pat)) {
                answer++;
            } else {
                continue;
            }
        }
        
        return answer;
    }
}