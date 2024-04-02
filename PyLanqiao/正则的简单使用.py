import re


# 1003 我要通过！
n = int(input())
for i in range(n):
    s = input()
    if re.match(r'A*PA+TA*',s):        # + 号代表前面的字符必须至少出现一次（1次或多次，所以是PAT,PAAT,PAAAT...）; * 号代表前面的字符可以不出现，也可以出现一次或多次（0次，1次，或多次，满足条件2）
        a = re.split(r'[P|T]',s)       # re.split 多分割符，以P 和 T分隔：P前面为a[0]，P和T中间的为a[1]，T之后的为a[2]
        if a[0]*len(a[1]) == a[2]:     #如果c=a*len(b)
            print('YES')
        else:
            print('NO')
    else:
        print('NO')
