class Solution {
    public int[] solution(String s) {
        int[] answer = new int [s.length()];
        boolean flag = true;
        for(int i = s.length()-1;i>=0;i--) {
            flag = true;
            int count = 1;
            answer[i]=-1;
            for (int j = i-1; j >= 0; j--) {
                if (flag == true && s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    answer[i] = count;
                }
                count++;
            }
        }
        return answer;
    }
}