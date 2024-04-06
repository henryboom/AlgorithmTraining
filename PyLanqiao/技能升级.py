import heapq as hq
n, m = map(int, input().split())
queue = []
for _ in range(n):
    a, b = map(int, input().split())
    queue.append([-a, b])
 
ans = 0
hq.heapify(queue)
print(hq)
print(queue)
while m:
    # print(queue)
    m -= 1
    a, b = hq.heappop(queue)
    ans += -a
    if -a - b >= b:
        hq.heappush(queue, [a + b, b])
print(ans)
