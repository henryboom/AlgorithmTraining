# 设置一个 path 记录当前的步数
path = 0
result = 0

def call(n):
    global path  # 声明 path 是全局变量
    global result
    # 终止条件
    if n == 1:
        result = path
        return  # 返回，结束函数的执行
    path += 1
    if n % 2 == 0:
        call(n // 2)
    else:
        call((3 * n + 1) // 2)

n = int(input())
call(n)
print(result)
