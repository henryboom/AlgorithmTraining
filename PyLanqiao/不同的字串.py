##不同的字串
#创建字串
str ="0100110001010001"
sub =[]
for i in range(len(str)+1):
    for j in range(i+1,len(str)+1):
        if str[i:j] not in sub :
            sub.append(str[i:j])
print(len(sub))
