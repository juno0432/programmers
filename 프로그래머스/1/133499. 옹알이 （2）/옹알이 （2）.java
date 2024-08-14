class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0 ; i < babbling.length ; i++)
        {
            if(babbling[i].contains("ayaaya")
               || babbling[i].contains("yeye")
              || babbling[i].contains("woowoo")
              || babbling[i].contains("mama"))
            {}
            else{
                babbling[i] = babbling[i].replace("aya", " ")
                .replace("ye", " ").replace("woo"," ").replace("ma"," ")
                    .replace(" ", "");
            
                if(babbling[i].length()==0) answer++;
            }
        }
        return answer;
    }
}