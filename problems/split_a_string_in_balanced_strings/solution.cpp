class Solution {
public:
    int balancedStringSplit(string s) {
        int ans = 0,counter=0;
        for(int i=0;i<s.length();i++){
            if(s[i] == 'R') counter++;
            else counter--;
            if(counter==0) ans++;      
    }
        return ans;
    }
};