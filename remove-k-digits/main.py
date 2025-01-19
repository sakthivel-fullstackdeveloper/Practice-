import sys
sys.set_int_max_str_digits(100000)
class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        num=list(num)
        length=len(num)
        temp="0"
        store=length-k
        stack=[]
        for i in range(length):
            while stack and len(stack) + (length-i) > store and stack[-1] > num[i]:
                stack.pop()
            if len(stack) <  store:
                stack.append(num[i])
        stack = "".join(stack)
        if stack =="":
            stack="0"
        else:
            stack=int(stack)
            stack=str(stack)
        return stack        
    
s=Solution()
num = "1432219"
k = 3
print(s.removeKdigits(num,k))