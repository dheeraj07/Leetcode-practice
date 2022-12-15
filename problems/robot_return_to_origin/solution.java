class Solution {
    public boolean judgeCircle(String moves) {
        int[] arr = new int[2];
        if(moves.length() % 2 == 1)
        {
            return false;
        }
        moves.chars().forEach((move) -> 
          {
              if(move == 'R')
              {
                  arr[0]++;
              }
              else if(move == 'D')
              {
                  arr[1]--;
              }
              else if(move == 'L')
              {
                  arr[0]--;
              }
              else if(move == 'U')
              {
                  arr[1]++;
              }
          });
        
        for(Integer i: arr)
        {
            if(i != 0)
            {
                return false;
            }
        }
        return true;
    }
}