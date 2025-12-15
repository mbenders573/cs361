def double(n:int) -> int:
    """
    Doubles an int by multiplying by 2 and returns value
    """
    return n * 2

def max(a:int,b:int) -> int:
    """
    Finds larger of two ints and returns
    """
    if a > b:
        return a
    else:
        return b

def fact(n:int) -> int:
    """
    Returns factorial of given int
    """
    match n:
        case 0:
            return 1
        case _:
            return n * fact(n-1)

def fib(n:int) -> int:
    """
    Returns the nth item of the fibonacci sequence
    """
    match n:
        case 0:
            return 0
        case 1:
            return 1
        case _:
            return fib(n-1) + fib(n-2)

from typing import List, TypeVar, Callable

T = TypeVar('T')
U = TypeVar('U')

def concat(x:List[T],y:List[T]) -> List[T]:
    """
    Concatinates two lists recursively
    """
    if x == []:
        return y
    else:
        hd = x[0]
        tl = x[1:]
        return [hd] + concat(tl, y)

def length(L:List[T]) -> int:
    """
    Finds the length of a list without pattern matching, recursively
    """
    if L == []:
        return 0
    else:
        return 1 + length(L[1:])

def lengthpm(L:List[T]) -> int:
    """
    Finds the length of a list with pattern matching, recursively
    """
    match L:
        case []:
            return 0
        case [hd, *tl]:
            return 1 + lengthpm(tl)

def doubleall(L:List[int]) -> List[int]:
    """
    Doubles all elements in a list, recursively
    """
    match L:
        case []:
            return []
        case [hd, *tl]:
            return [2 * hd] + doubleall(tl)

def reverse(L:List[T]) -> List[T]:
    """
    Reverses a list, recursively
    """
    if not L:
        return []
    else:
        hd,*tl = L
        return reverse(tl) + [hd]

def apply(L:List[T],function:Callable[[T],U]) -> List[U]:
    """
    Applies function to all elements of a list, recursively
    """
    match L:
        case []:
            return []
        case [hd, *tl]:
            return [function(hd)] + apply(tl, function)

# square function for apply
def square(n:int) -> int:
    return n * n

def applyOnlySquare(L:List[int]) -> List[int]:
    """
    A modified version of apply,
    applies the square function to all elements of a list
    """
    match L:
        case []:
            return []
        case [hd, *tl]:
            return [square(hd)] + applyOnlySquare(tl)