class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        si = {}

        if len(s) != len(t):
            return False

        for char in s:
            si[char] = si.get(char,0) + 1
        for char in t:
            if char not in si or si[char] == 0:
                return False
            si[char] -=1
            
        return True
        