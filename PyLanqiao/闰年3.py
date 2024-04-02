import datetime
year = int(input())
time = datetime.timedelta(days=1)
dt=datetime.date(year=year,month=3,day=1)

res =dt-time

if res.day==29 :
    print('yes')
else :
    print('no')
