import unittest

from practice.dsa.array.ContainsDuplicate import ContainsDuplicate


class MyTestCase(unittest.TestCase):
    obj = ContainsDuplicate()


    def test_success(self):
        numbers = [1,5,6,2,1,3]
        self.assertEqual(self.obj.usingHashing(numbers), True)
        self.assertEqual(self.obj.usingHashing(numbers), True)

    def test_failure(self):
        numbers = [1,2,3,4]
        self.assertEqual(self.obj.usingLengthCompare(numbers), False)
        self.assertEqual(self.obj.usingLengthCompare(numbers), False)


if __name__ == '__main__':
    unittest.main()
