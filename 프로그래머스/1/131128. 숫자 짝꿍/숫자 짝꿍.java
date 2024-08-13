import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int [] xArr = new int [10];
        int [] yArr = new int [10];
        
        for(int i = 0; i <X.length(); i++)
        {
            int num = X.charAt(i)-'0';
            xArr[num]++;
        }
        for(int i = 0; i <Y.length(); i++)
        {
            int num = Y.charAt(i)-'0';
            yArr[num]++;
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 9 ; i >= 0; i--)
        {
            int minResult = Math.min(xArr[i],yArr[i]);
            for(int j = 0; j<minResult; j++)
            {
                sb.append(i);
            }
        }

        answer = sb.toString();
        if(answer.isEmpty())
        {
            answer="-1";
        }
        
        boolean isZero = true;
        
        for(int i = 0; i < answer.length(); i++)
        {
            if(answer.charAt(i)!='0')
                isZero=false;
        }
        if(isZero==true)
        {
            return answer="0";
        }
        return answer;
    }
}