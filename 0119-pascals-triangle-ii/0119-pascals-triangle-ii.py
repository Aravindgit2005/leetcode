class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        ans=1
        ansr=[1]
        for i in range(1,rowIndex+1):
            ans*=((rowIndex+1)-i)
            ans//=i
            ansr.append(ans)
        return ansr
        