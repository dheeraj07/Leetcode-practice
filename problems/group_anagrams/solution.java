class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<List<Integer>, List<String>> mp = new HashMap<>();
    
        for(int i = 0; i < strs.length; i++)
        {
            Integer[] intRepr = new Integer[27];
            Arrays.fill(intRepr, 0);
            List<String> strList = new ArrayList<>();
            String st = strs[i];
            for(int j = 0; j < st.length(); j++)
            {
                intRepr[st.charAt(j) - 'a']++;
            }
            
            List<Integer> ch = Arrays.asList(intRepr);
            if(mp.containsKey(ch))
            {
                strList = mp.get(ch);
            }
            strList.add(st);
            mp.put(ch, strList);
        }
        List<List<String>> res = new ArrayList<>();
        
        res.addAll(mp.values());
        return res;
    }
}