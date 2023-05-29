class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = 0;
        
        if ( 0 < n && n < 1000 && (n/10) <= k && k <= 1000 ) {
            if ( n < 10 ) {
                answer = 12000 * n + 2000 * k;
            } else if ( n >= 10 ) {
                service = n / 10;
                answer = 12000 * n + 2000 * (k - service);
            }
        }
        return answer;
    }
}