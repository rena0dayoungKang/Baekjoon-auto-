class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        if (0 < money && money <= 1000000) {
            int coffee = money / 5500;
            int change = money - (coffee * 5500);
            answer[0] = coffee;
            answer[1] = change;
        }
        
        return answer;
    }
}