class Solution(object):
    def maximumWealth(self, accounts):
        result=[]
        len(accounts)
        for i in range(0,len(accounts),1):
            sum=0
            for j in range(0,len(accounts[i]),1):
                sum+=(accounts[i][j])
            result.append(sum)
        return max(result)
    
s=Solution()
accounts = [[1,2,3],[3,2,1]]
print(s.maximumWealth(accounts))