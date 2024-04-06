#十六进制转八进制
n=int (input())

for line in range(n):
    num =input()
    #格式化函数的妙用，可以将16进制直接转换为8进制
    ans=format(int(num,16),'o')
    print(ans)
