import datetime
year = int(input())
time=datetime.timedelta(days=1)#存储时间的变化量，这里等于1
dt=datetime.date(year=year,month=3,day=1)#设置时间是该年3月1日
res = dt-time#3月1日前一天
if res.day==29:
    print('yes')
else:
    print('no')
