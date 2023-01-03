class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startIndex = 0, maxStrLen = 0;
        Set<Character> st = new HashSet<>();
        for(int endIndex = 0; endIndex < s.length(); endIndex++)
        {
            while(!st.add(s.charAt(endIndex)))
            {
                st.remove(s.charAt(startIndex++));
            }
            maxStrLen = Math.max(st.size(), maxStrLen);
        }
        return maxStrLen;
    }
}