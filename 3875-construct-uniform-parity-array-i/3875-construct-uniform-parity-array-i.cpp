class Solution {
public:
    bool uniformArray(vector<int>& nums1) {
        int even = 0, odd = 0;
        int n = nums1.size();
        vector<int> nums2(n);

        int oddIndex = -1;

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0) {
                even++;
            } else {
                odd++;
                if (oddIndex == -1) {
                    oddIndex = i;
                }
            }
        }

        
        if (oddIndex != -1) {
            for (int i = 0; i < n; i++) {
                if (nums1[i] % 2 == 0) {
                    nums2[i] = nums1[i] - nums1[oddIndex]; 
                } else {
                    nums2[i] = nums1[i]; 
                }
            }
            return true;
        }

       
        return true;
    }
};