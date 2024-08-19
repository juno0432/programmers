class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int [targets.length];
        
        for(int targetArr = 0 ; targetArr < targets.length; targetArr++)
        {
            for(int targetStrLenght = 0; targetStrLenght < targets[targetArr].length(); targetStrLenght++)
            {
                char target = targets[targetArr].charAt(targetStrLenght);
                int minIndex = Integer.MAX_VALUE;
                boolean isExist = false;
                for(String key : keymap)
                {
                    int index = key.indexOf(target);
                    if(index != -1)
                    {
                        minIndex = Math.min(index+1, minIndex);
                        isExist = true;
                    }
                }
                if(isExist)
                {
                    answer[targetArr]+=minIndex;
                }
                else
                {
                    answer[targetArr]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}