str1 ='ABCDEFGHIJKLMNOPQRSTUVWXYZ'

yu=[]
num =2019
while num >=26:
    yu.append(num%26)
    #int型除法，不留余数
    num =num//26
#while终止的时候，还有个位没有加上
yu.append(num)
print(yu)

for i in yu[::-1]:
    print(str1[i-1],end='')

    
