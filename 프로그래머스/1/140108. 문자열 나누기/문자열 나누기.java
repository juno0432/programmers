class Solution
{
    public int solution(String s) 
    {
        int answer = 0;
        boolean isFirst = false;
        int chCount = 0;
        int notChCount = 0;
        char ch = ' ';
        
        for(int i = 0; i < s.length(); i++)
        {
            if(i==s.length()-1)
            {
                answer++;
                break;
            }
            if(isFirst == false)
            {
                ch = s.charAt(i);
                chCount = 1;
                notChCount = 0;
                isFirst = true;
            }
            else if(ch == s.charAt(i))
            {
                chCount++;
            }
            else
            {
                notChCount++;
                if(chCount == notChCount)
                {
                    answer++;
                    isFirst = false;
                }
            }
        
        }
        return answer;
    }
}