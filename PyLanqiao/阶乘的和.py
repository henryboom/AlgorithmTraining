

import os
import sys

from collections import  defaultdict

#接收一个参数n

n=int(input())

a= list(map(int,input().split()))

a.sort()

Map = defaultdict(int )


#进行计数
for i in a :
    Map[i]+=1
m=a[0]

while True:
    x=Map[m]
    if x % (m+1)==0