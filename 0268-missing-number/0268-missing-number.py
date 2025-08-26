class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        sum1=(n*(n+1))//2
        s2=0
        for i in nums:
            s2+=i
        return sum1-s2