class Solution {
    public String longestPalindrome(String s) {
        String ans = ""+s.charAt(0);
        int index;
        if(s.length() == 1)
        {
            return s;
        }
        
        for(int i = 0; i < s.length(); i++)
        {
            index = ans.length();
            for(int j = i+index; j < s.length(); j++)
            {
                if(checkIsPalindrome(i,j,ans, s))
                {
                    ans = s.substring(i, j+1);
                    System.out.println(ans);
                }
            }
        }
        return ans;
    }
    
    public boolean checkIsPalindrome(int i, int j, String ans, String s)
    {
        if(j - i + 1 <= ans.length())
        {
           return false; 
        }
        
        while(i < j)
        {
            if(s.charAt(i++) != s.charAt(j--))
            {
               return false; 
            }
        }
        return true;
    }

      
}