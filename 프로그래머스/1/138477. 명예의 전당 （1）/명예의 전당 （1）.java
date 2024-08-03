import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < Math.min(k, score.length); i++) {
            list.add(score[i]);
            Collections.sort(list);
            answer[index++] = list.get(0);
        }

        for (int i = k; i < score.length; i++) {
            if (score[i] > list.get(0) || (score[i] == list.get(0) && !list.contains(score[i]))) {
                list.remove(0);
                list.add(score[i]);
                Collections.sort(list);
            }
            answer[index++] = list.get(0); 
        }
        
        return answer;
    }
}
