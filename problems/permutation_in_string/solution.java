class Solution {
    
    
    public boolean checkIfEmpty(int arr[])
    {
     for(int i = 0; i< arr.length; i++)
     {
         if(arr[i] != 0) return false;
     }
        return true;   
    }
    
    
    public boolean checkInclusion(String s1, String s2) {
        
        if(s2.length() < s1.length() || s1.length() == 0 || s1.length() == 0)
        {
            return false;
        }
        
        int[] arr = new int[27];
        int startIndex = 0;
       
        
        for( int i = 0; i < s1.length() ; i++ )
        {
            arr[s1.charAt(i) - 'a']++;
        }
        
        for( int i = 0; i < s1.length() ; i++ )
        {
            arr[s2.charAt(i) - 'a']--;
        }
        
        if(checkIfEmpty(arr))
        {
            return true;
        };
        
        for(int i = s1.length(); i< s2.length(); i++)
        {
            arr[s2.charAt(startIndex++) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
            if(checkIfEmpty(arr))
            {
                return true;
            }
        }
        return false;
    }
        
        
        
        
}