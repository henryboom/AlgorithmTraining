#高塔
import os
import sys

# 请在此输入您的代码
ans=0
def fun(n,m):
  global ans
  #首先记录一下循环的 层数
  if n==0:
    ans=(ans+1)%998244353
    return
  if m==0:
    ans=(ans+1)%998244353
    return
  for i in range(1,m+1):
    fun(n-1,m-i)


n, m = map(int, input().split())
A1 = []
for _ in range(n):
    A1.extend(map(int, input().split()))
fun(n, m)
print(ans)
