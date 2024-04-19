import os
import sys


# 请在此输入您的代码
def gcd(x, y):  # 求最大公约数
    if x < y:
        x, y = y, x
    while x % y:
        x, y = y, x % y
    return y


def lcm(x, y):  # 求最小公倍数
    return x * y // gcd(x, y)


def runYear(y):  # 判断是否为闰年
    if (y % 4 == 0 and y % 100 != 0) or y % 400 == 0:
        return True
    return False


start, end = 2000, 2000000
hs = {1: 31, 2: 28, 3: 31, 4: 30, 5: 31, 6: 30, 7: 31, 8: 31, 9: 30, 10: 31, 11: 30, 12: 31}
ans = 1  # 2000000年1月1日是一个符合条件的日期，所以答案初始值为1
for m, v in hs.items():  # 遍历每个月
    for d in range(1, v + 1):  # 遍历每天
        t = lcm(m, d)  # 求出月份和天的最小公倍数
        ans += end // t - start // t  # 求出在年份范围内有多少是t的倍数

t = lcm(2, 29)  # 单独处理2月29号
for i in range(start // t, end//t):
    if i * t >= end:
        break
    elif runYear(i * t):  # 只有闰年有29号
        ans += 1

print(ans)
# print(35813063)
