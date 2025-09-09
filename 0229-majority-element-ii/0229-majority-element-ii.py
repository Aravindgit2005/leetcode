class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        c1,c2=0,0
        e1=None
        e2=None
        for i in range(0,len(nums)):
            if c1==0 and nums[i]!=e2:
                c1+=1
                e1=nums[i]
            elif c2==0 and nums[i]!=e1:
                c2+=1
                e2=nums[i]
            elif e1==nums[i]:
                c1+=1
            elif e2==nums[i]:
                c2+=1
            else:
                c1-=1
                c2-=1
        count=0
        count2=0
        l=[]
        for i in range(0,len(nums)):
            if nums[i]==e1:
                count+=1
            elif nums[i]==e2:
                count2+=1
        if count>(len(nums)//3):
            l.append(e1)
        if count2>(len(nums)//3):
            l.append(e2)
        return l
        