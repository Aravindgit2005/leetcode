class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int: 
        max1=0
        count=0
        for i in nums:
            if i == 1:
                count+=1
                max1=max(count,max1)
            else:
                count=0
        return max1
        