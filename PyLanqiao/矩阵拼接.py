#矩阵拼接
#模拟拼接情况，默认
def cal(a1, b1, a2, b2, a3, b3):
    x = [[a1, b1], [a2, b2], [a3, b3]]
    x.sort(reverse=True)
    a1, b1, a2, b2, a3, b3 = x[0][0], x[0][1], x[1][0], x[1][1], x[2][0], x[2][1]
    if a1 == a2 and a2 == a3:
        return 4
    if a1 == a2 or a2 == a3:
        return 6
    if a1 == a2 + a3:
        if b2 == b3:
            return 4
        else:
            return 6
#    if b1 == b2 or b2 == b3:
#        return 6
    return 8


t = int(input())
#切换长宽，8种情况，进行模拟判断，在最内层循环进行最小边数判断
for _ in range(t):
    x = list(map(int, input().split()))
    ans = 8
    for i in range(2):
        a1 = x[i]
        b1 = x[1 - i]
        for j in range(2, 4):
            a2 = x[j]
            b2 = x[5 - j]
            for k in range(4, 6):
                a3 = x[k]
                b3 = x[9 - k]
                ans = min(ans, cal(a1, b1, a2, b2, a3, b3))
    print(ans)
