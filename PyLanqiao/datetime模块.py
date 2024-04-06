import datetime
#1、日期增加
bt = datetime.date(2000,11,6)
print(bt)

#datetime.timedelta(days=100) #weeks / hours
a = datetime.timedelta(days=100)
b = a + bt
print(b)
print(datetime.date.today())
#给定日期求星期
print("bt是返回weekday，如果是星期一，返回0；如果是星期2，返回1，以此类推；：")
print(bt.weekday())
print("返回weekday，如果是星期一，返回1；如果是星期2，返回2，以此类推；")
print(bt.isoweekday())
