
from PruebaJenkinsPython import *
import unittest
class TestMyModule(unittest.TestCase):
    
    def test_sum(self):
        self.assertEqual(sum(5, 7), 12)
if __name__ == "__main__":
    unittest.main()
