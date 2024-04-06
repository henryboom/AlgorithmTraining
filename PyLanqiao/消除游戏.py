#消除游戏
strings=input()
need=''
list1=[0 for i in range(len(strings))]
#print(list1)
if len(strings)<=2:
    print(strings)
else:
    for j in range(1,2**18):
        if len(strings)==1:
            print(strings)
            break
        for i in range(1,len(strings)-1):#改一下搜索范围就行，无需判断边界
            #边缘特殊情况
#            if i==0:
 #               if strings[i]==strings[i+1]:
 #                   list1[i]=1
  #          if i==len(strings)-1:
  #              if strings[i]==strings[i-1]:
  #                  list1[i]==1
  #          else:
            #print(strings[i-1],strings[i],strings[i+1])
  #sdfhhhhcvhhxcxnnnnshh
                if strings[i]==strings[i-1] and strings[i]!=strings[i+1]:
                    list1[i]=list1[i+1]=1
                if strings[i]!=strings[i-1] and strings[i]==strings[i+1]:
                    list1[i]=list1[i-1]=1
        need=strings
        strings=""
        for i in range(len(list1)):
          if list1[i]==0:
            strings+=need[i]
        list1=[0 for i in range(len(strings))]
    if strings=="":
        print('EMPTY')
    else:
        if len(strings)>=2:
            print(strings)
