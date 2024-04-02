n = int(input())

# 创建一个空列表
b = []

# 接收一个二维数组
for i in range(n):
    a = list(map(str, input().split()))
    b.append(a)

# 根据元素的第三个元素进行排序
b.sort(key=lambda x: int(x[2]))

# 输出最后一个元素的信息，末尾换行
print(b[-1][0], b[-1][1])

# 输出第一个元素的信息，末尾不换行
print(b[0][0], b[0][1])
