class Solution {
    public int countBinarySubstrings(String s) {
        
        int currCount = 1, preCount = 0, ans = 0;
        for(int i = 1 ; i < s.length(); i++)
        {
            Character ch = s.charAt(i);
            if(ch != s.charAt(i-1))
            {
                ans += Math.min(preCount, currCount);
                preCount = currCount;
                currCount = 1;
            }
            else
            {
                currCount++;
            }
        
        }
        return ans+Math.min(preCount, currCount);  
    }
}