import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> winNumsSet = new HashSet<>();
        for (int win_num : win_nums) {
            winNumsSet.add(win_num);
        }

        int countMax = 0;
        int countMin = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                countMax++;  // 0은 모르는 번호로, 최대 맞출 수 있는 경우로 계산
            } else if (winNumsSet.contains(lotto)) {
                countMax++;  // 맞춘 경우, 최대 맞춘 수도 증가
                countMin++;  // 최소 맞춘 수도 증가
            }
        }
        
        int[] answer = new int[2];
        answer[0] = rank(countMax);  // 최대 순위
        answer[1] = rank(countMin);  // 최소 순위
        return answer;
    }

    private int rank(int count) {
        switch (count) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}
