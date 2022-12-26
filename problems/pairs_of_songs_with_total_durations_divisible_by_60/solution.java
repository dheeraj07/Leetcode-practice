class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] track = new int[60];
        int res = 0;
        for(Integer t: time)
        {
            t = t%60;
            if( t == 0)
            {
                res += track[0];
            }
            else
            {
                res += track[60 - t];
            }          
            track[t]++;
        }
        return res;
    }
}