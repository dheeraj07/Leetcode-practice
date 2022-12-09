class Solution {
    
    public void populateList(List<List<Integer>> ls, int len)
    {
        while(len >= 0)
        {
            List<Integer> empty = new ArrayList<>();
            ls.add(empty);
            len--;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> mp = new HashMap<>();
        List<List<Integer>> ls = new ArrayList<>();
        populateList(ls, nums.length);
        List<Integer> ans = new ArrayList<>();
        
        for(Integer i: nums)
        {
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        
        mp.forEach((key, v) -> {
            List<Integer> repr = ls.get(v);
            repr.add(key);
            ls.set(v, repr);
        });
        
        for(int j = ls.size()-1; j>=0; j--)
        {
            for(Integer i: ls.get(j))
            {
                ans.add(i);
                if(ans.size()==k)
                {
                    return ans.stream().mapToInt(v->v).toArray();
                }
            }
        }
        
        return ans.stream().mapToInt(i->i).toArray();
    }
}