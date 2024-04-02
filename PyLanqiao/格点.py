ans = 0
for x in range(1, 2021 + 1):  # 保证起码是1~2021的数据
    for y in range(1, 2021 // x + 1):  # 范围是1 ~ 2021//x
        # if x*y <= 2021: # 如果x*y<=2021
        ans += 1
print(ans)  # 答案：15698
