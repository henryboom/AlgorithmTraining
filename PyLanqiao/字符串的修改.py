a = input()
b = input()
l1 = len(a)
l2 = len(b)
# dp数组,
# dp[i][j]表示a[:i-1]和b[:j-1]中最长公共子序列的长度(i>0, j>0)
# i=0 和 j=0 表示空字符串，初始化dp数组为全0
dp = [[0 for j in range(l2 + 1)] for i in range(l1 + 1)]

# 有点类似于在进行串匹配
for i in range(1, l1 + 1):
    for j in range(1, l2 + 1):
        if a[i - 1] == b[j - 1]:
            # a的第i-1个字符和b的第j-1个字符相同
            dp[i][j] = dp[i - 1][j - 1] + 1
        else:
            dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
# 如果不相等则存储当前最大的值，最后的dp数组中必然为最大子序列的长度
res = max(l1, l2) - dp[-1][-1]
print(res)
# 这里需要注意的是，无论是长串变短，还是短串变长，都是满足最长公共子序列的长度
