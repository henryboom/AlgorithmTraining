#分解2019为三个正整数
#要求整数中不含有2和4,求解法个数
#定义一个检查函数，含有则直接返回False
tmp =0

def check(n):
    for i in str(n):
        if i =='2' or i== '4':
            return False
    return True
for i in range(1,2018):
    for j in range(i+1,2018):
        k=2019-i-j
        #这里设置k>j，是为了防止重复计算比如
        #已经计算了1 1 2017  当遍历到1 2017 1时已经不算 了
        if k>j and check(i) and check(j) and check(k):
            tmp=tmp+1
print(tmp)
