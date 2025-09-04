class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        k=k%len(nums)
        def rev(nums,start,end):
            while start<=end:
                nums[start],nums[end]=nums[end],nums[start]
                start+=1
                end-=1
        rev(nums,0,(len(nums)-k)-1)
        rev(nums,len(nums)-k,len(nums)-1)
        rev(nums,0,len(nums)-1)
        return nums