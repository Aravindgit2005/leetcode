class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        element=None
        count=0
        for i in range(0,len(nums)):
            if count==0:
                element=nums[i]
                count+=1
            elif element==nums[i]:
                count+=1
            elif element!=nums[i]:
                count-=1
        return element