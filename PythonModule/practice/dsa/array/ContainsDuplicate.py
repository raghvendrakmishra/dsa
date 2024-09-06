from typing import List

class ContainsDuplicate:
    # Brute-force approach
    def usingHashing(self, numbers: List[int]) -> bool:
        hashset = set()

        for num in numbers:
            if num in hashset:
                return True
            hashset.add(num)
        return False

    def usingLengthCompare(self, numbers: List[int]) -> bool:
        return not len(numbers) == len(set(numbers))
