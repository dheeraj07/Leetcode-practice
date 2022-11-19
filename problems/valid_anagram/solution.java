class Solution {
    
    public boolean checkIfArrayIsEmpty(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0) return false;
        }
        
        return true;
    }
    
    
    public boolean isAnagram(String s, String t) {
        int[] alphabets = new int[26];
        
        for(int i = 0; i < s.length(); i++)
        {
            alphabets[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++)
        {
            alphabets[t.charAt(i) - 'a']--;
        }
        
        return checkIfArrayIsEmpty(alphabets);
    }
}