#传入参数n个整数m次操作
#暴力，超时60分
def sheng(num,x):
    a=sorted(num[x-1:])
    num[x-1:]=a
    return num
def jiang(num,x):
    b = sorted(num[:x],reverse=True)
    num[:x]=b
    return num
n,m=map(int,input().split())
num=[i+1 for i in range(n)]
for i in range(m):
    p,q=map(int,input().split())
    if p == 0:
        num = jiang(num,q)
    else:
        num = sheng(num,q)
for i in range(n):
    print(num[i],end=' ')
