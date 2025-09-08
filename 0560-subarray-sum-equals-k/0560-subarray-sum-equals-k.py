import collections
from collections import defaultdict
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        pre=0
        cnt=0
        d=defaultdict(int)
        d[0]=1
        for i in range(len(nums)):
            pre+=nums[i]
            rem=pre-k
            cnt+=d[rem]
            d[pre]+=1
        return cnt

        