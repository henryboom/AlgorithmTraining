import math

def sieve_of_eratosthenes(limit):
    primes = []
    is_prime = [True] * (limit + 1)
    is_prime[0] = is_prime[1] = False

    for i in range(2, int(math.sqrt(limit)) + 1):
        if is_prime[i]:
            primes.append(i)
            for j in range(i * i, limit + 1, i):
                is_prime[j] = False

    return primes

def main():
    n = int(input())
    numbers = list(map(int, input().split()))

    max_number = max(numbers)
    primes = sieve_of_eratosthenes(max_number)

    pos = [0] * (max_number + 1)
    ansi, ansj = n + 1, -1

    for i, x in enumerate(numbers, start=1):
        l = n + 1

        for prime in primes:
            if prime > x:
                break
            if x % prime == 0:
                while x % prime == 0:
                    x //= prime
                if pos[prime]:
                    l = min(l, pos[prime])
                else:
                    pos[prime] = i

        if x > 1:
            if pos[x]:
                l = min(l, pos[x])
            else:
                pos[x] = i

        if l < ansi:
            ansi = l
            ansj = i

    print(ansi, ansj)

if __name__ == "__main__":
    main()
