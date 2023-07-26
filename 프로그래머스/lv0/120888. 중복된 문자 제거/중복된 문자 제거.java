class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        
        for (int i = 0; i < arr.length; i++) {
            //a.contains(b)   a에 b가 있는지 확인해라
            if (!answer.contains(arr[i])) {
                answer += arr[i];   
            } else {
                continue;  //눈에 잘 보이니깐, 적어주면 좋다.
            }
        }
        return answer;
    }
}