#每新增加一个数，就会跟旧的每一个数相乘再求和
#那么我们就维护一个sum存储n-1的和，和新加入的数相乘即可
def solve():
    n=int(input())
    a= list(map(int,input().split()))
    print(a)
    ans=0
    sum_val=0
    for i in range(n):
        ans+=sum_val*a[i]
        sum_val+=a[i]
    print(ans)
solve()
