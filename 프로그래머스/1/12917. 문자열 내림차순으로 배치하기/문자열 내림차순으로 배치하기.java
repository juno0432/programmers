import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append((char) arr[i]);
        }

        String answer = sb.toString();
        return answer;
    }
}
