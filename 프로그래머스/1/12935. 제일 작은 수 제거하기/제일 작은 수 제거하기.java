import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int num : arr)
        {
            if(num < min)
            {
                min=num;
            }
        }
        for(int num : arr){
            if(num!=min)
                result.add(num);
        }

        int [] answer= new int [result.size()];
        if(!result.isEmpty())
        {
            for(int i = 0; i < answer.length; i++)
            {
                answer[i]= result.get(i);
            }
        }
        else return new int[]{-1};
        return answer;
    }
}