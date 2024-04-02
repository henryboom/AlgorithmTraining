# 定义一个素数筛
def SieveOfEratosthenes(n):
    prime = [True for i in range(n + 1)]
    p = 2
    while (p * p <= n):
        if prime[p] == True:
            for i in range(p * 2, n + 1, p):
                prime[i] = False
        p += 1
    return prime


# 素数对猜想
def PrimePair(n):
    global count
    prime = SieveOfEratosthenes(n)
    for i in range(2, n - 1):
        if prime[i] and prime[i + 2]:
            # print(i, i + 2)
            # 设置一个变量进行计数
            count += 1


if __name__ == '__main__':
    # 输入一个整数
    n = int(input())
    # 设置一个变量进行计数
    count = 0
    # 调用函数
    PrimePair(n)
    # 输出结果
    print(count)
