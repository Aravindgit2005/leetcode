class Solution:
    def firstUniqChar(self, s: str) -> int:
        dictf={}
        for i in s:
            dictf[i]=dictf.get(i,0)+1
        for key,value in dictf.items():
            if value==1:
                return s.index(key)
                break
        return -1
            