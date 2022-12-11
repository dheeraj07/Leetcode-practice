class Solution {
    public int candy(int[] ratings) {
        int[] track = new int[ratings.length];
        Arrays.fill(track, 1);
        int ans = 0;
        
        for(int i = 1; i < ratings.length; i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                track[i] = track[i-1]+1;
            }
        }
        
        for(int i = ratings.length-2; i >= 0; i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                track[i] = Math.max(track[i], track[i+1]+1);
            }
        }
        
        for(int i = 0; i < track.length; i++)
        {
            ans += track[i];
        }
        return ans;
    }
}