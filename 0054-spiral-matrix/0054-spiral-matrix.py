class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
             return []
        n = len(matrix)      # Number of rows
        m = len(matrix[0])
        top = 0
        bottom = n - 1
        left = 0
        right = m - 1

        ans = []

        while top <= bottom and left <= right:
            # Traverse from left to right
            for i in range(left, right + 1):
                ans.append(matrix[top][i])
            top += 1

            # Traverse from top to bottom
            for i in range(top, bottom + 1):
                ans.append(matrix[i][right])
            right -= 1

            # Traverse from right to left
            if top <= bottom:
                for i in range(right, left - 1, -1):
                    ans.append(matrix[bottom][i])
                bottom -= 1

            # Traverse from bottom to top
            if left <= right:
                for i in range(bottom, top - 1, -1):
                    ans.append(matrix[i][left])
                left += 1

        return ans