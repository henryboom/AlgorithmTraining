import math

num = int(input("请输入一个三位数："))

# 提取百位、十位、个位数字
b = num // 100
s = (num // 10) % 10
g = num % 10

# 判断是否为水仙花数
if ((b**3) + (s**3) + (g**3)) == num:
    print('是水仙花数')
else:
    print('不是水仙花数')
