from typing import List
import numpy as np
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums2.extend(nums1)
        return float(np.median(nums2))
