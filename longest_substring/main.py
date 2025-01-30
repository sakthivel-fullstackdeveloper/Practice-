class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        count=[]
        subcount=[]
        i=0
        s=list(s)
        if(len(s)!=0):
            while(i<len(s)-1):
                if(s[i]!=s[i+1] and s[i] not in count):
                    count.append(s[i])
                    subcount.append(len(count))
                    i+=2
                else:
                   count=[]
                   i+=1
            if len(subcount)!=0 and len(subcount)!=1:
                return max(subcount)
            elif(len(subcount)==1):
                return 2
            else:
                return 1
        else:
            return 0
        
s=Solution()
print(s.lengthOfLongestSubstring("abcabcbb"))
print(s.lengthOfLongestSubstring("bbbbb"))
print(s.lengthOfLongestSubstring("pwwkew"))
print(s.lengthOfLongestSubstring("cdd"))
       