# 字符串分类统计
def main():
    alpha_count = 0
    digit_count = 0
    blank_count = 0
    other_count = 0
    strinp = input(str())
    for i in strinp:
        if i.isalpha():
            alpha_count += 1
        elif i.isdigit():
            digit_count += 1
        elif i == ' ':
            blank_count += 1
        else:
            other_count += 1
    print(alpha_count, digit_count, blank_count, other_count)

if __name__=="__main__":
    main()
# 题目描述：
# 输入一行字符，分别统计出其中英文字母、数字、空格和其他字符的个数。
# 输入描述：
# 一行字符,长度不超过200
# 输出描述：
# 统计值
# 样例输入：
# aklsjflj123 sadf918u324 asdf91u32oasdf/.';123
# 样例输出：
# 23 16 2 4