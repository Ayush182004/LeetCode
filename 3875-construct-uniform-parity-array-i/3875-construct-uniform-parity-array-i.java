
class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean hasOdd = false;
        boolean hasEven = false;

        for (int num : nums1) {
            if (num % 2 == 1) {
                hasOdd = true;
            } else {
                hasEven = true;
            }
        }

        if (!hasOdd || !hasEven) {
            return true;
        }

        return true;
    }
}