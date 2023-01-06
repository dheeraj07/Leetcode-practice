class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0, startPointer = 0, maxCurrCount = 0;
        int charCount[] = new int[26];
        
        for(int endPointer = 0; endPointer < s.length(); endPointer++)
        {
            ++charCount[s.charAt(endPointer) - 'A'];
            maxCurrCount = Math.max(maxCurrCount, charCount[s.charAt(endPointer) - 'A']);
            int validRange = endPointer - startPointer + 1;
            if(validRange - maxCurrCount > k)
            {
                --charCount[s.charAt(startPointer++) - 'A'];
            }
            else
            {
                maxLen = Math.max(maxLen, endPointer - startPointer + 1);
            }
        }
        
        return maxLen;
    }
}