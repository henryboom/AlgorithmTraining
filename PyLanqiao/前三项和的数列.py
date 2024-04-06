#前三项和的数列
#创建一个初始化的数列
a=[1 for _ in range(3)]
#print(a[0])
for i in range(3,20190324,1):
#     print(a[i-1])
    a.append((a[i-3]+a[i-2]+a[i-1])%10000)
print(a[20190323])

