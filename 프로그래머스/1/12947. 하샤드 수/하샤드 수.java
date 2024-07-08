import java.util.Scanner;

// 21번째 06월 16일 하샤드 수 :양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
public class cote21 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        boolean result = sol.solution(num1);

        System.out.println(result);
    }
}

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        char [] ch = str.toCharArray();
        int result = 0;

        for(int i = 0; i<ch.length; i++)
        {
            result+= Character.getNumericValue(ch[i]);
        }
        if(x%result==0)
        {
            answer=true;
        }
        else answer=false;
        return answer;
    }
}