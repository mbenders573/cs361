def factorial(n):
    if not isinstance(n, int):
        raise TypeError("Input has to be int")
    if n < 0:
        raise ValueError("Number can't be negative")
    if n > 998:
        raise ValueError("Can't handle factorial over 998")

    if (n == 0):
        return 1
    else:
        return n * factorial(n - 1)

def fibonacci(n, fibs={0:0,1:1}):
    if not isinstance(n, int):
        raise TypeError("Input has to be int")
    if n < 0:
        raise ValueError("Number can't be negative")
    if n > 999:
        raise ValueError("Can't handle fibonacci over 999")
    
    if n not in fibs:
        fibs[n] = fibonacci(n - 1, fibs) + fibonacci(n - 2, fibs)
    
    return fibs[n]

def test_language(n,m):
    if (n == 0):
        return 0
    else:
        return test_language(n-1,test_language(n,m))

def tail_fib(n,a,b):
    y1 = n
    y2 = a
    y3 = b

    while (y1 != 0):
        temp = y2
        y2 = y3
        y3 = temp + y3
        y1 = y1 - 1

    return y2

def fib_iterative(n):
    return tail_fib(n,0,1)
    
if __name__ == '__main__':
    num = 100
    #print(factorial(num))
    #print(fibonacci(num))

    # if not terminating, innermost evaluation
    #test_language(0,1)

    print(fib_iterative(num))