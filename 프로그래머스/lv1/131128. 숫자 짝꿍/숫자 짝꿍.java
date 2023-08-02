import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        //1. x에서 숫자와 갯수 매핑
        Map<String, Integer> map1 = new HashMap<>();
        String[] arrX = X.split("");
        for (int i = 0; i < arrX.length; i++) {
            map1.put(arrX[i], map1.getOrDefault(arrX[i], 0) + 1);
        }

        //2. 맵에서 숫자와 갯수 빼주면서 리스트에 담기
        //ex) X 에서 0 두 개 -> Y에서 0 세 개 있어도 0은 두개만 사용
        List<String> list1 = new ArrayList<>();
        String[] arrY = Y.split("");
        for (int i = 0; i < arrY.length; i++) {
            //map1.put(arrY[i], map1.getOrDefault(arrY[i], 0) - 1);
            int tmp = map1.getOrDefault(arrY[i], 0);
            if(tmp > 0){
                map1.put(arrY[i], tmp - 1);
                list1.add(arrY[i]);
            }
        }
        
        //3. 리스트에 담은 숫자를 역정렬 하여 가장 큰 정수,
        //리스트를 돌면서 answer에 string으로 추가
        Collections.sort(list1, Collections.reverseOrder());
        if (list1.size() == 0) {
            answer = "-1";
        }
        
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(0).equals("0")) {
                answer = "0";
                break;
            } else {
                sb.append(list1.get(i)); 
            }
        }
        
        if(answer.equals("0") || answer.equals("-1")){    
        } else {
            answer = sb.toString();
        }
        return answer;
    }
}