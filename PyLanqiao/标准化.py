#标准化

import datetime

# 创建一个日期对象
bt = datetime.date(2000, 11, 6)

# 使用isoformat()方法获取ISO 8601格式的日期字符串
iso_date = bt.isoformat()

# 打印ISO 8601格式的日期字符串
print(iso_date)

# 使用字符串的格式化功能自定义输出格式
formatted_date = "{},{},{}".format(bt.year, bt.month, bt.day)

# 打印自定义格式的日期字符串
print(formatted_date)
