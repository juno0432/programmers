import java.util.Scanner;

// 22번째 06월 18일 두 정수 사이의 합 :두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
public class cote23 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        long result = sol.solution(num1);
        System.out.println(result);
    }
}
class Solution {
    public int solution(int num) {
        int answer = 0;
        answer = collatz(num,0);
        return answer;
    }
    private int collatz(long num, int count)
    {
        if(num==1){
            return count;
        }
        else if(count>=500)
        {
            return -1;
        }
        else if(num%2 == 0)
        {
            return collatz(num/2,count+1);
        }
        else {
            return collatz((num*3)+1,count+1);
        }
    }
}


