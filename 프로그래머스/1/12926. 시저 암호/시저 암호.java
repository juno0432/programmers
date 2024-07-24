class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++)
        {
           char ch = (char)(s.charAt(i)+n);
            if(Character.isWhitespace(s.charAt(i))){
                sb.append(" ");
            }
            else if (Character.isLowerCase(s.charAt(i)))
            {
                if (ch > 'z')
                {
                    sb.append((char)(ch-26));
                }
                else
                    sb.append(ch);
            }
            else {
                if (ch > 'Z')
                {
                    sb.append((char)(ch-26));
                }
                else
                    sb.append(ch);
            }
        }
        answer=sb.toString();
        return answer;
    }
}