class Solution {
public:
    int bitwiseComplement(int num) {
         string str;
        int ans = 0;
        if(num > 0){
        while(num > 0)
        {
            str += (num%2)+'0';
            num = num/2;
        }
        reverse(str.begin(),str.end());
        int len = str.length()-1;
        for(int i = len;i>=0;i--)
        {
            if(str[i] == '0')
            {
                ans += pow(2,len - i);
            }
        }
        }
        else ans = 1;
        
        return ans;
    }
};
