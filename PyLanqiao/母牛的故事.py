def main():
    list = []  # 定义列表
    list.append(0)  # 往list添加初始数据
    list.append(1)  # 第一年奶牛数量为1
    list.append(2)  # 第一年奶牛数量为2
    list.append(3)  # 第一年奶牛数量为3
    for i in range(4, 55):  # 预处理前55年的奶牛数量
        list.append(list[i - 1] + list[i - 3])
    while True:
        n = int(input())  # 化为整型
        if n == 0:  # n == 0 时退出
            break
        print(list[n])  # 直接输出


if __name__ == '__main__':
    main()
