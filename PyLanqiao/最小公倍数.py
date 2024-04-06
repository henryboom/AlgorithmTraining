# 最小公倍数 lcm = a*b/gcd(a,b)
# gcd为最大公约数

def gcd(a,b):
    #辗转相除，最后输出不是零 的那个数即为最小公约数
    while b!=0:
        c=a%b
        a=b
        b=c
    return a
if __name__ == '__main__':
    a, b=map(int ,input().split())
    lcm=a*b/gcd(max(a,b),min(a,b))
    print(int(lcm))
