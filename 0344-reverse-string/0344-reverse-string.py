class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        if (len(s)>=1) and (len(s)<=10**5):
            reverse_string=s.reverse()
            return reverse_string