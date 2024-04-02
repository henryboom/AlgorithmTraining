def sieve_of_eratosthenes(n):  # 埃拉托色尼筛选法，返回少于n的素数
    primes = [True] * (n + 1)  # 范围0到n的列表
    p = 2  # 这是最小的素数
    while p * p <= n:  # 一直筛到sqrt(n)就行了
        if primes[p]:  # 如果没被筛，一定是素数
            for i in range(p * 2, n + 1, p):  # 筛掉它的倍数即可，这里从下一个数开始筛选，否则会被覆盖原来的true
                primes[i] = False
        p += 1
    primes = [element for element in range(2, n) if primes[element]]  # 得到所有少于n的素数
    return primes


print(sieve_of_eratosthenes(100))

# 这个也是快速筛选，不过是打标记
# def get_prime(n):
#     prime = [1] * (n + 1)
#     prime[0] = 0
#     prime[1] = 0
#     for i in range(2, int(n ** 0.5) + 1):
#         if prime[i] == 1:
#             for j in range(2 * i, n + 1, i):
#                 prime[j] = 0
#     return prime
