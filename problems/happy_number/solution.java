class Solution {
    
    public int checkForHappyNumber(int num)
    {
        int sumPower = 0, digit;
        while(num > 0)
        {
            digit = num%10;
            num/=10;
            sumPower += Math.pow(digit, 2);
        }
        return sumPower;
    }
    
  
    
    public boolean isHappy(int n) 
    {
        Set<Integer> st = new HashSet<>();
        while(true)
        {
            n = checkForHappyNumber(n);
            if(!st.add(n))
            {
                if(n == 1)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        } 
    }
}