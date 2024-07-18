class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(temp);
        sb = sb.reverse();
        answer = Integer.parseInt(sb.toString(),3);
        return answer;
    }
}