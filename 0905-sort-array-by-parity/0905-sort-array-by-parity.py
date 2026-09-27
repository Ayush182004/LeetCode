class Solution(object):
    def sortArrayByParity(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        ans = []
        res = []
        for i in nums:
            if i % 2 == 0:
                ans.append(i)
            else:
                res.append(i)

        return ans + res