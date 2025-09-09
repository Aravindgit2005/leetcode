class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        def gen(n):
            ans=1
            ansr=[1]
            for col in range(1,n):
                ans*=(n-col)
                ans//=col
                ansr.append(ans)
            return ansr
        ans=[]
        for i in range(1,numRows+1):
            ans.append(gen(i))
        return ans
        