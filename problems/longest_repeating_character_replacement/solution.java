class Solution {
    public int characterReplacement(String s, int k) {
        
        int windowStart = 0, maxStrLen = 0, charCount, maxCharCount = 0;
        HashMap<Character, Integer> charOccurence = new HashMap<Character, Integer>();
        
        
        for( int windowEnd = 0; windowEnd < s.length(); windowEnd++)
        {
            charCount = charOccurence.containsKey(s.charAt(windowEnd)) ? charOccurence.get(s.charAt(windowEnd)) : 0;
            charOccurence.put(s.charAt(windowEnd), charCount+1);
            int range = windowEnd - windowStart + 1;
            maxCharCount = Math.max(maxCharCount, charCount+1);
            if(range - maxCharCount > k)
            {
                charCount = charOccurence.get(s.charAt(windowStart))-1;
                if(charCount == 0)
                {
                    charOccurence.remove(s.charAt(windowStart));
                }
                else
                {
                   charOccurence.put(s.charAt(windowStart), charCount); 
                }
                windowStart++;
            }
            else
            {
                maxStrLen = Math.max(range, maxStrLen);
            } 
        }
        return maxStrLen;
        
    }
}