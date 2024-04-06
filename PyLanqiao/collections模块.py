import collections
print("逻辑右移rotate:")
collections.deque([])
q = collections.deque([1, 2, 3, 4])
q.rotate(1)
print(q)  # [4, 1, 2, 3]
q.rotate(1)
print(q)  # [3, 4, 1, 2]
print("统计数字Counter:")
# 创建一个 Counter 对象
counter_obj = collections.Counter([1, 2, 3, 1, 2, 3, 1, 2])

# 打印 Counter 对象
print("统计数字Counter:")
print(counter_obj)
