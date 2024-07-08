import java.util.Scanner;

public class cote22 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        long result = sol.solution(num1,num2);
        System.out.println(result);
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a,b);
        
        for(int i = start ; i <=end; i++)
        {
            answer+=i;
        }
        return answer;
    }
}