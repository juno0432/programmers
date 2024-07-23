class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1=0, index=0;
        for(int i = 0 ; i<sizes.length; i++)
        {
            for(int j = 0; j<sizes[i].length; j++)
            {
                if(sizes[i][j]>max1)
                {
                    max1=sizes[i][j];
                    index=i;
                }
            }
        }
        int max2=0;
        for(int i = 0 ; i<sizes.length; i++)
        {
            if(i!=index && max2<Math.min(sizes[i][0],sizes[i][1]))
            {
                max2=Math.min(sizes[i][0],sizes[i][1]);
            }
        }
        if(max2<Math.min(sizes[index][0],sizes[index][1]))
            max2=Math.min(sizes[index][0],sizes[index][1]);
        answer=max1*max2;
        return answer;
    }
}