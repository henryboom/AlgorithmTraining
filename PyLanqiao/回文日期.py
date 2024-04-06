import datetime
#本题要分别判断是否为回文和ABABBABA型所以并不能嵌套而是该写
#为多个函数
def is_valid_date(date_str, format='%Y%m%d'):
    try:
        datetime.datetime.strptime(date_str, format)
        return True
    except ValueError:
        return False

def is_huiwen(n):
    if n == n[-1::-1]:
        #print(f"{n} 是一个回文日期")
        return True
    else:
        return False
def is_ABBA(n):
    if n == n[-1::-1]:
        if  n[:2]==n[2:4] and n[0]!=n[1]:
            return True
        else:
            return False
    return False
# 首先判断是否为合法日期
n = input()
# 注意这里不需要使用 str() 将输入转换为字符串

#创建一个日期对象
date_obj = datetime.datetime.strptime(n, "%Y%m%d")
date_obj=date_obj+datetime.timedelta(days=1)
huiwen="a"
ABAB="b"
# 将 datetime 对象转换为字符串
#date_str = date_obj.strftime("%Y%m%d")
while True:
    #首先判断这个日期，有可能同时是两种
    if huiwen=="a" and ABAB=="b":
        if is_huiwen(date_obj.strftime("%Y%m%d")) and is_ABBA(date_obj.strftime("%Y%m%d")):
            huiwen=date_obj.strftime("%Y%m%d")
            ABAB=date_obj.strftime("%Y%m%d")
            print(date_obj.strftime("%Y%m%d"))
            print(date_obj.strftime("%Y%m%d"))
            break
    #判断只是为回文
    if huiwen=="a":
        if is_huiwen(date_obj.strftime("%Y%m%d")) and not is_ABBA(date_obj.strftime("%Y%m%d")):
            print(date_obj.strftime("%Y%m%d"))
            huiwen=date_obj.strftime("%Y%m%d")
    if ABAB=="b":
        if is_ABBA(date_obj.strftime("%Y%m%d")):
            print(date_obj.strftime("%Y%m%d"))
            ABAB=date_obj.strftime("%Y%m%d")
            break
    date_obj=date_obj+datetime.timedelta(days=1)
        
    
