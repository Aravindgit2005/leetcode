class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        count=0
        j=0
        maxl=0
        for i in range(0,len(nums)):
            if nums[i]==0:
                count+=1
            while count>k:
                if nums[j]==0:
                    count-=1
                j+=1
            maxl=max(maxl,i-j+1)
        return maxl
        
        