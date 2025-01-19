class Solution(object):
    def mostCompetitive(self, mylist, k):
        stack=[]
        for i in range(len(mylist)):
            while stack and stack[-1]>mylist[i] and len(stack) +(len(mylist)-i)>k:
                stack.pop()
            if len(stack) <k:
                stack.append(mylist[i])       
        return stack
    
nums = [2,4,3,3,5,4,9,6]
k = 4
s=Solution()
print(s.mostCompetitive(nums,k))