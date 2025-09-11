class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        ans=nums[0]+nums[1]+nums[2]
        for i in range(len(nums)-2):
            j=i+1
            k=len(nums)-1
            while j<k:
                sums=nums[i]+nums[j]+nums[k]
                if abs(sums-target)<abs(ans-target):
                    ans=sums
                if sums==target:
                    return sums
                if sums>target:
                    k-=1
                else:
                    j+=1
        return ans
        