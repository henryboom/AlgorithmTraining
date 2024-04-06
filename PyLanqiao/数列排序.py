#数列排序
#输入一个数字
n=int(input())
#接受空格分开的数字存入列表
list=list(map(int ,input().split()))
#sorted排序
list=sorted(list)
for i in range(len(list)):
    print(list[i],end =' ')
list=sorted(list,reverse=True)
for i in range(len(list)):
    print(list[i],end =' ')

