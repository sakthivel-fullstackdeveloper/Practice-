class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        for i in range(len(s)):
            s=list(s)
            temp=s[0]
            s.pop(0)
            s.append(temp)
            s="".join(s)
            if(s==goal):
                return True
        return False

v=Solution()
s = "abcde"
goal = "cdeab"
print(v.rotateString(s,goal))