class Solution {
    public int totalFruit(int[] fruits) {
        
        HashMap<Integer, Integer> fruitsMap = new HashMap<Integer, Integer>();
        int runningTotal = 0, windowStart = 0, maxFruits = 0, fruitsCount;
        
        for(int windowEnd = 0; windowEnd < fruits.length; windowEnd++)
        {
            fruitsCount = fruitsMap.containsKey(fruits[windowEnd]) ? fruitsMap.get(fruits[windowEnd]) : 0;
            fruitsMap.put(fruits[windowEnd], fruitsCount+1);
            while(fruitsMap.size() > 2)
            {
                fruitsCount = fruitsMap.get(fruits[windowStart])-1;
                if(fruitsCount == 0){
                    fruitsMap.remove(fruits[windowStart]);
                }
                else
                {
                   fruitsMap.put(fruits[windowStart], fruitsCount);
                }
                ++windowStart;
            }
            maxFruits = Math.max(maxFruits, windowEnd+1-windowStart); 
        }
        return  maxFruits;
    }
}