#砝码称重

# 最多有101个砝码，每个砝码的重量上限为100000
N = 101
M = 100001

# 使用二维列表存储结果，初始化为0
a = [[0] * M for _ in range(N)]

# 第一个砝码，作为起点
a[0][0] = 1

# 输入砝码数量
n = int(input())
# 存储每个砝码的重量
#w = [0] * (n + 1)
w = [0] + list(map(int, input().split()))
# 总重量的上限，用于检测循环上限
sum_weight = sum(w)

#print(sum_weight)



#动态转移，依次加减砝码尝试，每一次复制上一次的已经存在砝码in的状态
for i in range(1,1+n):
    for j in range(sum_weight+1):
        a[i][j]=a[i-1][j]+a[i-1][abs(j-w[i])]+a[i-1][j+w[i]]
#结束，a[n]中存储了所有的结果，若a[n][i]中不为零即表示可以被称出来，
        #至于是哪几个我们不必记录
result =0
for i in range(1,sum_weight+1):
    if a[n][i]:
        result+=1
print(result)
