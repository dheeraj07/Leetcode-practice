class Solution {
    int length;
    public String findLexSmallestString(String s, int a, int b) {
        Queue<String> qu = new LinkedList<>();
        HashSet<String> st = new HashSet<>();
        String minSoFar = s;
        length = s.length();
        
        qu.add(s);
        st.add(s);
        
        while(!qu.isEmpty())
        {
            String topQueueEle = qu.peek();
            //System.out.println(topQueueEle);
            if(topQueueEle.compareTo(minSoFar) < 0)
            {
                minSoFar = topQueueEle;
            }
            qu.poll();
            
            char[] strInChar = topQueueEle.toCharArray();
            String firstOp = performFirstOp(strInChar, a);
            if(st.add(firstOp))
            {
                qu.add(firstOp);
            }
            
            String secondOp = performSecondOp(topQueueEle, b);
            if(st.add(secondOp))
            {
                qu.add(secondOp);
            } 
        }
         return minSoFar;
    }
    
    public String performFirstOp(char[] s, int a)
    {
        for(int i = 1; i < length; i+=2)
        {
            int num = ((s[i] - '0') + a)%10;
            s[i] = (char) (num + '0');
        }
        return String.valueOf(s);
    }
    
    
    public String performSecondOp(String s, int b)
    {
        String rotateStr = s.substring(s.length()-b,s.length()) + s.substring(0, s.length()-b);
        return rotateStr;       
    }
}