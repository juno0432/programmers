import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int[] arrInt = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = arr[i];
        }
        Arrays.sort(arrInt);
        
        for (int i = arrInt.length - 1; i >= 0; i--) {
            sb.append((char) arrInt[i]);
        }
        
        String answer = sb.toString();
        return answer;
    }
}
