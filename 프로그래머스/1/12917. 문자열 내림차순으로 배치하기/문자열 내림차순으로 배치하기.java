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
        
        for (int i = 0; i < arrInt.length - 1; i++) {
            for (int j = i + 1; j < arrInt.length; j++) {
                if (arrInt[i] < arrInt[j]) {
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        
        for (int num : arrInt) {
            sb.append((char) num);
        }
        String answer = sb.toString();
        return answer;
    }
}