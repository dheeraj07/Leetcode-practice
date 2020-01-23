class Solution {
public:
    int numJewelsInStones(string J, string S) {
        vector<int> v(123,0);
        for(int i=0;i<J.length();i++){
            v[J[i]]++;
        }
        int count = 0;
        for(int j=0;j<S.length();j++){
            if(v[S[j]]>0) count++;
        }
        return count;       
    }
};