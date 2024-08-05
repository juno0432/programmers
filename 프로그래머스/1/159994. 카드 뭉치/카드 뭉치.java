class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        boolean flag = true;
        int card1Index = 0;
        int card2Index = 0;
        int goalIndex =0;
        
        while (goalIndex < goal.length)
        {
            if(card1Index < cards1.length && cards1[card1Index].equals(goal[goalIndex]))
            {
                card1Index++;
                goalIndex++;
            }
            else{
                if(card2Index < cards2.length && cards2[card2Index].equals(goal[goalIndex]))
                {
                    card2Index++;
                    goalIndex++;
                }
                else
                {
                    return "No";
                }
            }
        }
        return "Yes";
    }
}