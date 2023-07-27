class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        char[] chr = code.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            //(chr[i]+"").equals("1")
            if (chr[i] == '1') {   //characther형은 == 으로 비교한다.
                //0->1   1->0
                if(mode == 0){
                    mode = 1;
                } else {
                    mode = 0;
                }
            } else{
                if (mode == 0 && i % 2 == 0) {
                    ret += chr[i];
                } else if (mode == 1 && i % 2 == 1) {
                    ret += chr[i];
                } else {
                    continue;
                }
            }
        }    
        if (ret.equals("")){
            // ret == null
            ret = "EMPTY";
            }
        return ret;
    }
}