class Solution {
    public int[] sortByBits(int[] arr) {
        
        int []res = new int[arr.length];
        int j = 0;
        for(Integer i: arr)
        {
            res[j++] = Integer.bitCount(i)*10001+i;
        }
        
        Arrays.sort(res);
        j = 0;
        for(Integer i: res)
        {
            res[j++] = i%10001;
        }
        return res;
    }
}