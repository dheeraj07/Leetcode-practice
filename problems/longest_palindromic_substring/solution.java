class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i); 
        //expands around center to check for palindrome of odd length
        int len2 = expandAroundCenter(s, i, i + 1);
        //expands around center to check for palindrome of even length
        int len = Math.max(len1, len2); 
        //Compares the two lengths and assigns the larger value to len
        if (len > end - start) {
            start = i - (len - 1) / 2;
            //Assigns the start index of the longest palindrome
            end = i + len / 2;
            //Assigns the end index of the longest palindrome
        }
    }
    return s.substring(start, end + 1);
    }
    
    private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right; //Assigns the left and right indices 
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
        //Compares the characters at the left and right indices, and if they're the same, 
        //the indices are decremented and incremented, respectively
        L--;
        R++;
    }
    return R - L - 1; 
    //returns the length of the palindrome
}
}