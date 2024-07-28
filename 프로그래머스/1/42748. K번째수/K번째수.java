import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index=0, count=0;
        //커멘드 뭉탱이 돌기
        for(int i = 0; i<commands.length; i++)
        {
            index=0;
            //커맨드 내부 돌기
            int [] result = new int [commands[i][1] - commands[i][0]+1];
            for(int j = commands[i][0]-1; j<=commands[i][1] -1;j++)
            {
                //2번째가 index[1]임
                result[index++] = array[j];
            }
            Arrays.sort(result);
            answer[i]=result[commands[i][2] - 1];
        }
        return answer;
    }
}
