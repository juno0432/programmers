class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < s.length(); i++)
        {
            char ch = s.charAt(i);
         if(skip.indexOf(ch) == -1)
         {
             int count =0;
             while(count < index)
             {
                 ch++;
                 if(ch > 'z')
                 {
                     ch = 'a';
                 }
                 if(skip.indexOf(ch)==-1)
                 {
                     count++;
                 }
             }
         }
            sb.append(ch);
        }
        answer = sb.toString();
        return answer;
    }
}