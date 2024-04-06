time={'0':'zero','1':'one','2':'two','3':'three','4':'four','5':'five'
      ,'6':'six','7':'sever','8':'eight','9':'nine','10':'ten',
      '11':'eleven','12':'twelve','13':'thirteen','14':'fourteen',
      '15':'fifteen','16':'sixteen','17':'seventeen','18':'eighteen',
      '19':'ninteen','20':'twenty','30':'thirty','40':'forty','50':'fifty'}

h,m= input().split()
hour =time[h]
if int(m)>20:
    a=int(m)//10*10
    b= int(m)%10
    c=time[str(a)]
    d= time[str(b)]
    print(hour,c,d,end='')
else:
    c=time[m]
    print(hour,c,end='')
