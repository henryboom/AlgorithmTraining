import math 
#一个快速求n内的素数的方法
def sieve_of_eratosthenes(limit):
    #创建一个列表存放素数
    primes=[]
    #设置标记数组
    is_prime=[True]*(limit+1)
    is_prime[0]=is_prime[1]=False

    #排除所有素数的倍数
    for i in range(2,limit+1):
        if is_prime[i]:
            primes.append(i)
            for j in range(i*i,limit+1,i):
                is_prime[j]=False
    return primes
n= int (input())
print(sieve_of_eratosthenes(n))
