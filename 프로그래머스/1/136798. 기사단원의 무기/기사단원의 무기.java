class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1 ; i <= number; i++)
        {
            int result = divisor(i);
            if(result > limit)
            {
                answer += power;
            }
            else
            {
                answer += result;
            }
        }
        return answer;
    }
    private int divisor(int num)
    {
        int count=0;
        int sqrt = (int) Math.sqrt(num);
        for(int i = 1; i <= sqrt; i++)
        {
            if(num%i==0)
            {
                count++;
                if(i != num/i)
                    count++;
            }
        }
        return count;
    }
}