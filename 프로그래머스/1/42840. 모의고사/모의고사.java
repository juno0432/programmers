import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0, count2 = 0, count3 = 0;
        
        for(int i = 0; i < answers.length; i++)
        {
            if(answers[i] == arr1[i%5]) count1++;
            if(answers[i] == arr2[i%8]) count2++;
            if(answers[i] == arr3[i%10]) count3++;
        }
        
        int max = Integer.MIN_VALUE;
        
        if(count1 >= max)
        {
            max = count1;
        }
        if(count2 >= max)
        {
            max = count2;
        }
        if(count3 >= max)
        {
            max = count3;
        }
        if(count1 == max)
        {
            result.add(1);
        }
        if(count2 == max)
        {
            result.add(2);
        }
        if(count3 == max)
        {
            result.add(3);
        }
        
        int[] answer = new int [result.size()];
        for(int i = 0 ; i<result.size(); i++)
        {
            answer[i] = result.get(i);
        }
        return answer;
    }
}