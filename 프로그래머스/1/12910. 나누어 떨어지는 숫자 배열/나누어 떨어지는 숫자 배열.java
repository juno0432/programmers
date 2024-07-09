import java.util.Arrays;
import java.util.Scanner;

public class cote25 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int [] num1 = {5,9,7,10};
        int num2 = 5;
        int [] result = sol.solution(num1,num2);
        for(int i=0; i<result.length; i++)
            System.out.println(result[i]);
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int cnt=0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]%divisor == 0)
            {
                answer[cnt]=arr[i];
                cnt++;
            }
        }
        if(cnt==0)
            answer[0]=-1;
        Arrays.sort(answer);
        return answer;
    }
}