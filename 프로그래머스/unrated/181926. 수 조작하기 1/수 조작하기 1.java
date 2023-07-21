class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String[] str = control.split("");
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("w")) {
                n++;
            } else if (str[i].equals("s")) {
                n--;
            } else if (str[i].equals("d")) {
                n = n + 10;
            } else if (str[i].equals("a")) {
                n = n - 10;
            }
            answer = n;
        }

        return answer;
    }
}