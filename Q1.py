from typing import List
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a=len(nums)
        i=0
        j=0
        g=0
        while i<a:
            j=i+1
            while i+1<a:
                if j>=a:
                    break
                if nums[i]+nums[j]==target:
                    g=1
                    break
                j+=1
            if g==1:
                break
            i+=1

        return [i,j]
