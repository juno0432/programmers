class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;
        int index = 0, cnt = 0;
        StringBuilder sb = new StringBuilder();
        while(flag)
        {
            if(s.length()-1 <= index)
            {
                flag=false;
            }
            char ch = s.charAt(index);
            if(ch == ' ')
            {
                sb.append(ch);
                cnt=0;
            }
            else if(cnt%2==0)
            {
                sb.append(Character.toUpperCase(ch));
                cnt++;
            }
            else
            {
                sb.append(Character.toLowerCase(ch));
                cnt++;
            }
            index++;
        }
        answer = sb.toString();
        return answer;
    }
}