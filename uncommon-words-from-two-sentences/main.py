from collections import Counter

class Solution(object):
    def uncommonFromSentences(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: List[str]
        """
        words = s1.split() + s2.split()
        word_count = Counter(words)
        return [word for word in word_count if word_count[word] == 1]


s1 = "this apple is sweet"
s2 = "this apple is sour"
s=Solution()
print(s.uncommonFromSentences(s1,s2))