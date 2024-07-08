import java.util.Arrays;
import java.util.*;
import java.lang.*;

// 20번째 06월 15일 정수 내림차순으로 배치하기 : 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
public class cote20 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        long result = sol.solution(num1);

        System.out.println(result);
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char [] num = str.toCharArray();
        Arrays.sort(num);
        StringBuilder sb = new StringBuilder(new String(num));
        sb.reverse();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}