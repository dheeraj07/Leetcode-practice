class Solution {
    
    public boolean isEmpty(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        
       if(s2.length() < s1.length())
       {
           return false;
       }
        int arr[] = new int[26];
        
        int i = 0,j = 0;
        for(; i < s1.length(); i++)
        {
            arr[s1.charAt(i) - 'a']++;
        }

         for(; j < s1.length(); j++)
        {
             arr[s2.charAt(j) - 'a']--;
        }
        
        if(isEmpty(arr))
        {
            return true;
        }
        i = 0;
        for(; j < s2.length(); j++)
        {
            arr[s2.charAt(i) - 'a']++;
            i++;
            arr[s2.charAt(j) - 'a']--;
            if(isEmpty(arr))
            {
                return true;
            }
        }
        return false;
    }
}