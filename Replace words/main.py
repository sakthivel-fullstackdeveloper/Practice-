from typing import List

class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        root_set = set(dictionary)
        def find_root(word: str) -> str:
            for i in range(1, len(word) + 1):
                if word[:i] in root_set:
                    return word[:i]
            return word  
        words = sentence.split()
        replaced_words = [find_root(word) for word in words]
        return " ".join(replaced_words)

s=Solution()
dictionary = ["cat","bat","rat"]
sentence = "the cattle was rattled by the battery"
print(s.replaceWords(dictionary,sentence))