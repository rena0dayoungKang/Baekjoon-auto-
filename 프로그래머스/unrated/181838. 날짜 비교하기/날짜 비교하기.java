class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
          String date1Str = String.format("%04d%02d%02d", 
                                          date1[0], date1[1], date1[2]);
        String date2Str = String.format("%04d%02d%02d", 
                                        date2[0], date2[1], date2[2]);
        
        int a = Integer.parseInt(date1Str);
        int b = Integer.parseInt(date2Str);
        
        if (a < b) {
            answer = 1;
        }
        
        return answer;
    }
}