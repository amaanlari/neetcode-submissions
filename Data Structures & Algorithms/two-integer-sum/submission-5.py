class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        compDict = dict()

        for i in range(0, len(nums)):
            comp = target - nums[i]
        
            if comp in compDict:
                return [compDict[comp], i]
        
            compDict[nums[i]] = i