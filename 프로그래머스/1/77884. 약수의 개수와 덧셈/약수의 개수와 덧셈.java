class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int currentIndex = left; currentIndex<=right; currentIndex++)
        {
            int result = divisorCnt(currentIndex);
            if(result%2==0)
            {
                answer+=currentIndex;
            }
            else answer-=currentIndex;
        }
        return answer;
    }
    public int divisorCnt(int num)
    {
        int answer=0;
        for(int i = 1; i<=num; i++)
        {
            if(num%i==0)
            {
                answer++;
            }
        }
        return answer;
    }
}
