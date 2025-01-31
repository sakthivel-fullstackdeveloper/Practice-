def fact(n):
    if n == 0 or n == 1:  # Base case
        return 1
    return n * fact(n - 1)  # Recursive call

n = int(input("Enter a number: "))
print("Factorial:", fact(n))
