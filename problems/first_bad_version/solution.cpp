// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        bool found = false;
        long long low = 0,high = n, mid = ceil(n/2.0);
        int ans = 0;
        while(!found)
        {
            if(high <= 2){
                if(isBadVersion(1)){
                    ans = 1;
                }
                else ans = 2;
                found = true;
            }
            else if(low+1 == mid || high-1 == mid) 
            {
                if(isBadVersion(mid-1)){
                    ans = (int)mid-1;
                }
                else if(isBadVersion(mid)) ans = (int)mid;
                else ans = (int)high;
                found = true;
            }
            else if(isBadVersion(mid))
            {
                high = mid;
                mid = ceil(mid/2.0);
                n = high;
            }
            else
            {
                low = mid;
                high = n;
                mid = ceil((low+high)/2.0);

            }
    }
        return ans;
    }
};