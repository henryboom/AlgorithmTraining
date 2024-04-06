#分解质数因子
#判断是否为质数
def zhishu(n):
    for i in range(2,n):
        if n%i==0:
            return 0
    return 1

#首先先尝试除法，找到所有因数，同时进行质数的判断
if __name__ =='__main__':
    #接受一个数
    n=int(input())
    summ=0
    #这里记录a为因子中大的一个，防止1*2和2*1重复计算
    a=0
    #因子最大不超过k，因为最小的因数为2
    k=(n//2)+1
    for i in range(2,k):
        if n%i==0:
            a=int(n/i)
            m=zhishu(i)
            #下面是判断两个因数的质数与否
            if a>i and zhishu(a):
                summ+=1
            if m==1:
                summ+=1
print(summ)          
