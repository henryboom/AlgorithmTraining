# 例如：((xx|xxx)x|(x|xx))xx 能接受的最长字符串是： xxxxxx，长度是 6。

#
# s = '((xx|xxx)x|(x|xx))xx'
# i = 0
# floor = 0
#
#
# def dfs():
#     global floor, i
#     print(f'此时: i = {i}')
#     floor += 1
#     print(f'进入一层，此时的层数为 {floor}')
#     res = 0
#     while i < len(s):
#         if s[i] == '(':
#             floor += 1
#             i += 1
#             res += dfs()
#             i += 1  # 跳过）,继续加下一个括号的内容
#         elif s[i] == ')':
#             floor -= 1
#             return res
#         elif s[i] == 'x':
#             i += 1
#             res += 1
#         elif s[i] == '|':
#             i += 1
#             res = max(res, dfs())
#     return res
#
#
# dfs()
s = list(input().strip())
i = 0


def dfs():
    global i
    res = 0
    while i < len(s):
        # 遇到 '('，递归调用函数，对接下的 'x' 计数
        if s[i] == '(':
            i += 1
            res += dfs()
            i += 1
        # 遇到 ')'，返回计数结果
        elif s[i] == ')':
            return res
        # 遇到 'x'，计数+1，索引后移
        elif s[i] == 'x':
            i += 1
            res += 1
        # 遇到 '|'，返回左右两边的较大值
        elif s[i] == '|':
            i += 1
            res = max(res, dfs())
    return res


print(dfs())
