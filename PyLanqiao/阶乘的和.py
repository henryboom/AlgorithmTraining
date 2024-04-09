from collections import defaultdict


def find_largest_divisible_subset(n, a):
    a.sort()
    count_map = defaultdict(int)

    for num in a:
        count_map[num] += 1

    max_num = a[0]

    while True:
        count = count_map[max_num]
        if count % (max_num + 1) == 0:
            count_map[max_num + 1] = count // (max_num + 1)
            max_num += 1
        else:
            break

    return max_num


if __name__ == "__main__":
    n = int(input("Enter the value of n: "))
    a = list(map(int, input("Enter the list of numbers separated by space: ").split()))

    result = find_largest_divisible_subset(n, a)
    print("The size of the largest divisible subset is:", result)
