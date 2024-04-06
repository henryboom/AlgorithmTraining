#1的个数
#n的输入，进行累加计算
n= int (input())
ans=0
for i in range(1,n+1):
    strn =str(i)
    ans+=strn.count('1')
print(ans)
