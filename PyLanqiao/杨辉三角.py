def C(a,b): # 计算组合值
    res=1
    tmp=a
    for j in range(1,1+b):
        res=res*tmp//j #累除取余j
        if res > n:
            return res  #大于n已无意义，且防止爆LL
        tmp = tmp -1
    return res

def check(k):
    # 二分该斜行,找到大于等于该值的第一个数
    # 左边界2k，右边界为max(l, n)取二者最大，避免右边界小于左边界
    l,r=k*2,max(1,n)
    while l<r :
        mid =l+r >>1
        print(mid,k)
        if C(mid ,k)>=n:
            r=mid
        else:
            l=mid+1
    if C(r,k)!=n:
        return False
    print(r*(r+1)//2+k+1)
    return True

n=int(input())
if n==1:
    print(1)
else:
    k=16 # 从第16斜行枚举
    while not check(k):
        k=k-1
