class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      
        Arrays.sort(boxTypes, new java.util.Comparator<int[]>() 
        {
            public int compare(int[] a, int[] b) 
            {
                return Integer.compare(b[1], a[1]);
            }
        });
        
        int totalBoxes = 0;
        for(int i = 0; i < boxTypes.length; i++)
        {
            totalBoxes += Math.min(boxTypes[i][0], truckSize)*boxTypes[i][1];
            truckSize -= boxTypes[i][0];
            if(truckSize <= 0)
            {
                break;
            }
        }
        return totalBoxes; 
    }
}