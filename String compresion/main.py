class Solution:
    def compressedString(self, word: str) -> str:
        compressed = []
        n = len(word)
        i = 0 
        while i < n:
            current_char = word[i]
            count = 0
            while i < n and word[i] == current_char and count < 9:
                count += 1
                i += 1  
            compressed.append(f"{count}{current_char}")     
        return ''.join(compressed)

s=Solution()
print(s.compressedString("abcde"))