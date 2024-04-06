my_tuple = (("a", 1), ("b", 2), ("c", 3))

# 使用字典推导式将元组转换为字典
my_dict = {key: value for key, value in my_tuple}

print(my_dict)
