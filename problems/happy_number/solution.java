class Solution {
    
    
    
    public Integer getSquaredSum(Integer n)
    {
        Integer digit = 0;
        while(n > 0)
        {
            digit += (int) Math.pow(n%10,2);
            n/=10;
        }
        return digit;
    }
    
    
    public boolean isHappy(int n) 
    {
        Set<Integer> squaredSum = new HashSet<Integer>();
        Integer sum = 0;
        while(n != 1 && squaredSum.add(n))
        {
            n = getSquaredSum(n);
        }  
        return n == 1;
    }
}