#输入时间戳，输出当前的 时分秒
#接受参数
n = int (input())
n=n/1000#取到的是秒数
H=n//(60*60)

M=(n-H*3600)//60#当前的分钟数，应该减去时

s=n%60

#格式化输出
if(H>24):
    H=H%24
print('%.2d:%.2d:%.2d'%(H,M,s))
