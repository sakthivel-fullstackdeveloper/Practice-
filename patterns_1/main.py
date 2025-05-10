class Solution:
    def longestPalindrome(self, s: str) -> str:
        i=0
        j=len(s)-1
        while(i<j):
            if(s[i]==s[j] and i!=j):
                print("matched")
                s=s[i:j+1]
                j-=1
                i+=1
                while(i<j):
                
            else:
                print("not matched")
                j-=1
                
        return s
S=Solution()
print(S.longestPalindrome("baabad"))