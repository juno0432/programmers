class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(t.substring(0,p.length()));
        int rt=p.length();
        int count=0;

        while(rt<=t.length())
        {
            if(Long.parseLong(p)>=Long.parseLong(sb.toString()))
            {
                count++;
            }
            if(rt==t.length())
            {
                break;
            }
            sb.append(t.charAt(rt));
            sb.deleteCharAt(0);
            rt++;
        }
        answer=count;
        return answer;
    }
}