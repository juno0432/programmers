import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> remain = new ArrayList<>();
        for(int i = 0 ; i <numbers.length; i++)
        {
            remain.add(numbers[i]);
        }
        for(int i = 1; i <= 9; i++)
        {
            if(!remain.contains(i))
                answer+=i;
        }
        return answer;
    }
}