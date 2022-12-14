class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        
       for(int i = 0; i<s.length(); i++)
       {
           int asc = s.charAt(i) - 'a';
           arr[asc]++;
       }
        
        for(int i = 0; i<s.length(); i++)
        {
            int asc = s.charAt(i) - 'a';
            if(arr[asc] == 1)
            {
                return i;
            }
        }
        return -1;
    }
}