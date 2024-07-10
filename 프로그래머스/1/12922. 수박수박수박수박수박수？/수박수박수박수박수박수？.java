class Solution {
    public String solution(int n) {
        StringBuilder result = new StringBuilder();
        String answer = "";
        for(int i = 1; i<=n; i++) {
            if (i % 2 != 0)
               result.append("수");
            else result.append("박");
        }
        answer=result.toString();
        return answer;
    }
}
