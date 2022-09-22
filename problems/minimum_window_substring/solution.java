class Solution {
    
    public void addStringIfSmall(TreeMap<Integer, String> mp, int start, int end, String s)  
    {
        if(mp.size() == 0)
        {
            mp.put(end-start, s.substring(start, end));
        }
        else
        {
             Integer lowestRange = mp.firstKey();
            if(lowestRange != null && end - start < lowestRange)
            {
                mp.put(end-start, s.substring(start, end));
            }
        }
    }
    
    
    public String minWindow(String s, String t) {
        
        int[] subStrArr = new int[65];
        int[] arr = new int[65];
        int subStrCount = 0, strCount = 0, windowStart = 0, endIndex = 0;
        TreeMap<Integer, String> mp = new TreeMap<Integer, String>();
        
        
        if((s.length() < t.length()) || t.length() == 0)
        {
            return "";
        }
        
        int i;
        for(i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if(subStrArr[ch - 65] == 0)
            {
                subStrCount++;
            }
           subStrArr[ch - 65]++;  
        }
        //System.out.println(subStrCount);
        
        for(i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            arr[ch - 65]++;
            if(arr[ch - 65] == subStrArr[ch - 65])
            {
                strCount++;
            }
            if(strCount == subStrCount)
            {
                while(subStrArr[s.charAt(windowStart) - 65] == 0)
                {
                    ++windowStart;
                }
                while(subStrArr[s.charAt(windowStart) - 65] < arr[s.charAt(windowStart) - 65])
                {
                    arr[s.charAt(windowStart) - 65]--;
                    ++windowStart;   
                }
                int currLength = i - windowStart;
                if(!mp.containsKey(currLength))
                {
                    addStringIfSmall(mp, windowStart, i+1, s);
                }
               while(strCount == subStrCount)
               {
                   ch = s.charAt(windowStart++);
                   arr[ch - 65]--;
                   if(arr[ch - 65] != subStrArr[ch - 65] && subStrArr[ch - 65] > arr[ch - 65])
                    {
                        strCount--;
                    }                   
               }
                if(i == s.length()-1)
                {
                     addStringIfSmall(mp, windowStart-1, i+1, s);
                }
            }
                /*    System.out.println("SubstrCount: "+subStrCount);
                    System.out.println("strCount: "+strCount);
            System.out.println("I: "+i);
            System.out.println("WindowStart: "+windowStart);
            System.out.println("=========== ");*/
        }
        

        
       return mp.size() > 0 ? mp.firstEntry().getValue() : "";
    }
}