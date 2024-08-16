class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] result = new int[n];
        for(int i = 0 ; i <reserve.length;i++)
        {
            result[reserve[i]-1]++;
        }
        for(int i = 0; i<lost.length; i++)
        {
            result[lost[i]-1]--;
        }
        
        for(int i = 0; i < n; i++)
        {
            if(result[i]==1)
            {
                if(i!=0 && result[i-1]==-1)
                {
                    result[i-1]++;
                    result[i]--;
                }
                else if(i!=n-1 && result[i+1]==-1)
                {
                    result[i+1]++;
                    result[i]--;
                }
            }
        }
        for(int i = 0 ; i <n ; i++)
        {
            if(result[i]==0 || result[i]==1)
            {
                answer++;
            }
        }
        return answer;
    }
}