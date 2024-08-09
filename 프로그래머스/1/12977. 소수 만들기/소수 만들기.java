class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int num1 = 0 ; num1 < nums.length-2 ; num1++)
        {
            for(int num2 = num1+1 ; num2 <nums.length-1 ; num2++)
            {
                for(int num3 = num2+1 ; num3 <nums.length ; num3++)
                {
                    int sum = nums[num1] + nums[num2] + nums[num3];
                    if(isPrime(sum))
                    {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean isPrime(int num)
    {
        for(int i = 2; i<=Math.sqrt(num); i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}