class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        //1. db를 순회하면서 id_pw의 배열의 값과 비교 
        //2. 아이디, 비밀번호 모두 일치 -> "login"
        //   하나라도 불일치 -> 로그인 실패 -> 아이디 일치 X -> fail
        //                              -> 비밀번호 일치X -> wrong pw
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] a : db) {
            if (a[0].equals(id) && a[1].equals(pw)) {
                answer = "login";
                break;
            } else if (a[0].equals(id) && !a[1].equals(pw)) {
                answer = "wrong pw";
                break;
            } else if (!a[0].equals(id)) {
                answer = "fail";
            }
        }
        
        
        return answer;
    }
}