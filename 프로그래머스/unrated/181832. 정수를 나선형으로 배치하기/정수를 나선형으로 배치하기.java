class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];//배열의 초기값은 모두 0
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        answer[0][0] = 1;
        int cnt = 2;
        int idx = 0;
        int x = 0, y = 0; //현재위치
        
        while (cnt <= n * n) {
            int nx = x + dx[idx];
            int ny = y + dy[idx];
            
            if ((nx >= 0) && (nx < answer.length) &&
               (ny >= 0) && (ny < answer[0].length) &&
               answer[nx][ny] == 0) {
                answer[nx][ny] = cnt;
                cnt++;
                x = nx;
                y = ny;
            } else {
                idx = (idx + 1) % 4;
            }
        }     
        return answer;
    }
}