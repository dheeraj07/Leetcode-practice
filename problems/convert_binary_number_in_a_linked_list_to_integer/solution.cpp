/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int getDecimalValue(ListNode* head) {
        string ss;
        ListNode* decimal = head;
        while(decimal!=NULL){
            ss += to_string(decimal->val);
            decimal = decimal->next;
        }
       // reverse(ss.begin(),ss.end());
        long long int ans = 0;
        for(int i=0;i<ss.length()-1;i++){
           if(ss[i] == '1'){
               ans += pow(2,(ss.length()-i-1));
           }   
        }
        if(ss[ss.length()-1]=='1') ans+=1;
        return ans;
    }
};