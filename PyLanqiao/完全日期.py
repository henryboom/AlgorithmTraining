# 【问题描述】
#
# 如果一个日期中年月日的各位数字之和是完全平方数，则称为一个完全日期。
#
# 例如：2021年6 月5 日的各位数字之和为2 + 0 + 2 + 1 + 6 + 5 = 16，而 16 是一个完全平方数，它是 4 的平方。所以2021 年 6 月 5 日是一个完全日期。
#
# 例如：2021年6 月23 日的各位数字之和为2 + 0 + 2 + 1 + 6 + 2 + 3 = 16 ，是一个完全平方数。所以2021 年6 月23 日也是一个完全日期。
#
# 请问，从2001 年1 月1 日到2021 年12 月31 日中，一共有多少个完全日期？
#
# 【思路分析】
#
#     常规日期题，模拟日期操作然后判断即可。日期，最大 8 位数，最大的和应为2 + 0 + 1 + 9 + 1 + 2 + 2 + 9 = 26，所以可以提前算出来[1,4,9,16,25]这几个数，然后直接判断即可，不必重复计算。

def wonderDate(year, month, day):
    date = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
    # 将年份转换为列表中的整数
    #
    # 参数:
    # year - 需要转换的年份，整数类型
    #
    # 返回值:
    # 将年份的每个数字转换为整数的列表
    year = list(map(int, list(str(year))))
    # 总结注释：这一行代码的目的是将一个整数类型的年份转换成一个包含每个数字的整数列表。
    # 具体步骤是先将年份转换成字符串，然后将字符串中的每个字符转换成整数，
    # 最后使用map函数将这些整数映射成一个列表。
    month = list(map(int, list(str(month))))
    day = list(map(int, list(str(day))))
    return sum(year) + sum(month) + sum(day) in date


year, month, day, c = 2001, 1, 1, 0
while year < 2022:
    if wonderDate(year, month, day):
        c += 1
    day += 1
    if year in [2004, 2008, 2012, 2016, 2020] and month == 2 and day > 29:
        day = 1
        month += 1
    elif month == 2 and day > 28:
        day = 1
        month += 1
    elif month in [1, 3, 5, 7, 8, 10, 12] and day > 31:
        day = 1
        month += 1
    elif month in [4, 6, 9, 11] and day > 30:
        day = 1
        month += 1
    if month > 12:
        month = 1
        year += 1
print(c)
