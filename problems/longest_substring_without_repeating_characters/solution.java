class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int windowStart = 0, maxSubStrLen = 0, trackIndex;
        //HashSet<Character> trackSubStr = new HashSet<Character>();
        HashMap<Character, Integer> trackSubMap = new HashMap<Character, Integer>();
        /*Solve for this example:
        abba
        */
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++)
        {
            if(trackSubMap.containsKey(s.charAt(windowEnd)))
            {
                windowStart = Math.max(trackSubMap.get(s.charAt(windowEnd))+1,windowStart);
            }
            trackSubMap.put(s.charAt(windowEnd), windowEnd);
            maxSubStrLen = Math.max(maxSubStrLen, windowEnd+1-windowStart);
        }
       return  maxSubStrLen;
    }
}