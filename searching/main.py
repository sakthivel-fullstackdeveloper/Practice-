def solution(mylist):
    
    mylist_sorted=[]
    length = len(mylist)
    i=0

    while(i<=length-1):
        if(length%2!=0):
            if (i+1)>=length:
                if(mylist[0]>mylist[i]):
                    mylist_sorted.append(mylist[0])
                    i+=1
                else:
                     mylist_sorted.append(mylist[i])
                     i+=1
            else:
                if(mylist[i]>mylist[i+1]):
                    mylist_sorted.append(mylist[i])
                    i+=2
                else:
                     mylist_sorted.append(mylist[i+1])
                     i+=2
        else:
            if(i+1!=length):
                if(mylist[i]>mylist[i+1]):
                    mylist_sorted.append(mylist[i])
                    i+=1
                else:
                     mylist_sorted.append(mylist[i+1])
                     i+=2
            
        
    return mylist_sorted
    

mylist=input("enter the numbers : ")
mylist="".join((mylist.split()))
print(solution(mylist))
