import sys
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        sumn=0
        maxn=-sys.maxsize-1
        for i in range(0,len(nums)):
            sumn+=nums[i]
            if sumn > maxn:
                maxn=sumn
            if sumn<0:
                sumn=0
        return maxn
        