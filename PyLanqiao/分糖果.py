import os
import sys

# 请在此输入您的代码

x = 9
y = 16
result = 0


def dfs(depth, x, y):
    global result
    if depth == 7:
        if x == 0 and y == 0:
            result += 1
            return
        return
    for i in range(0, x + 1):
        for j in range(0, y + 1):
            if 5 >= i+j >= 2:
                dfs(depth + 1, x - i, y - j)


dfs(0, 9, 16)
print(result)
