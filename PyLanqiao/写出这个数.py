# 接收一个数字
n = input()

# 将数字转换为字符串，并将每位数字拆分成列表
list1 = list(map(int, n))

# 创建对应的拼音列表
list2 = ['ling', 'yi', 'er', 'san', 'si', 'wu', 'liu', 'qi', 'ba', 'jiu']

# 计算数字的各位之和
num1 = sum(list1)

# 将各位之和转换为字符串，并将每位数字拆分成列表
listNum = list(str(num1))

# 输出每一位各位数字之和的拼音表示，拼音数字间有 1 空格，最后一个拼音数字后没有空格
for i in listNum:
    if i == listNum[-1]:
        print(list2[int(i)])
    else:
        print(list2[int(i)], end=' ')

# # 接收一个数字
# n = input()
#
# # 将数字转换为字符串，并将每位数字拆分成列表
# list1 = list(map(int, n))
#
# # 创建对应的拼音列表
# list2 = ['ling', 'yi', 'er', 'san', 'si', 'wu', 'liu', 'qi', 'ba', 'jiu']
#
# # 计算数字的各位之和
# num1 = sum(list1)
#
# # 将各位之和转换为字符串，并将每位数字拆分成列表
# listNum = list(str(num1))
#
# # 输出每一位各位数字之和的拼音表示，拼音数字间有 1 空格，最后一个拼音数字后没有空格
# print(' '.join([list2[int(i)] for i in listNum]))

