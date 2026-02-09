# Print 1 to 1000 Prime Numbers
def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num)):
        if num % i == 0:
            return False
    return True

def print_prime():
    lst_prime_numbers = []
    for i in range(2,1001):
        if is_prime(i):
            lst_prime_numbers.append(i)
    print(f"List of prime numbers are as:{lst_prime_numbers}")

'''prime_numbers = []
for number in range(1, 1001):
    if is_prime(number):
        prime_numbers.append(number)
print(f"Prime numbers between 1 and 1000 are: {prime_numbers}")'''

# Print 1 to 1000 Armstrong Numbers Eg: 153
# Explanation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
def is_armstrong(num):   
    sum = 0
    num_str = str(num)
    power = len(num_str)
    for digit in num_str:
        sum += int(digit) ** power
    return sum == num

def print_armstrong():
    lst_armstrong=[]
    for i in range(1,1001):
        if is_armstrong(i):
            lst_armstrong.append(i)
    print(f"List of all armstrong numbers are as:{lst_armstrong}")

'''def is_armstrong(num):
    sum = 0
    temp = num
    while temp > 0:
        digit = temp % 10
        sum += digit ** 3
        temp //= 10
    return sum == num'''

'''armstrong_numbers = []
for number in range(1, 1001):
    if is_armstrong(number):
        armstrong_numbers.append(number)
print(f"Armstrong numbers between 1 and 1000 are: {armstrong_numbers}")'''

# Print 1 to 1000 Disarium Numbers Eg: 135
# Explanation: 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
def is_disarium(num):   
    sum = 0
    num_str = str(num)
    for index, digit in enumerate(num_str):
        sum += int(digit) ** (index + 1)
    return sum == num

def print_disarium():
    disarium_numbers = []
    for number in range(1, 1001):
        if is_disarium(number):
            disarium_numbers.append(number)
    print(f"Disarium numbers between 1 and 1000 are: {disarium_numbers}")
    
'''disarium_numbers = []
for number in range(1, 1001):
    if is_disarium(number):
        disarium_numbers.append(number)
print(f"Disarium numbers between 1 and 1000 are: {disarium_numbers}")'''

# Print 1 to 1000 Neon Numbers Eg: 9
# Explanation: 9^2 = 81 -> 8 + 1 = 9
def is_neon(num):   
    square = num * num
    sum = 0
    while square > 0:
        digit = square % 10
        sum += digit
        square //= 10
    return sum == num

def print_neon():
    neon_numbers = []
    for number in range(1, 1001):
        if is_neon(number):
            neon_numbers.append(number)
    print(f"Neon numbers between 1 and 1000 are: {neon_numbers}")

    '''neon_numbers = []
    for number in range(1, 1001):
        if is_neon(number):
            neon_numbers.append(number)
    print(f"Neon numbers between 1 and 1000 are: {neon_numbers}")'''

# Print 1 to 1000 Spy Numbers Eg: 123
# Explanation: 1 + 2 + 3 = 6 and 1 * 2 * 3 = 6
def is_spy(num):
    sum = 0
    product = 1
    temp = num
    while temp > 0:
        digit = temp % 10
        sum += digit
        product *= digit
        temp //= 10
    return sum == product

def print_spy():
    spy_numbers = []
    for number in range(1, 1001):
        if is_spy(number):
            spy_numbers.append(number)
    print(f"Spy numbers between 1 and 1000 are: {spy_numbers}")

'''spy_numbers = []
for number in range(1, 1001):
    if is_spy(number):
        spy_numbers.append(number)  
print(f"Spy numbers between 1 and 1000 are: {spy_numbers}")'''

# Print 1 to 1000 Perfect Square Numbers Eg: 1, 4, 9, 16
def is_perfect_square(num):
    root = int(num ** 0.5)
    return root * root == num

def print_perfect_squares():
    perfect_square_numbers = []
    for number in range(1, 1001):
        if is_perfect_square(number):
            perfect_square_numbers.append(number)
    print(f"Perfect square numbers between 1 and 1000 are: {perfect_square_numbers}")

'''perfect_square_numbers = []
for number in range(1, 1001):
    if is_perfect_square(number):
        perfect_square_numbers.append(number)
print(f"Perfect square numbers between 1 and 1000 are: {perfect_square_numbers}")'''

# Print 1 to 1000 Perfect Numbers Eg: 6, 28
# Explanation: 6 = 1 + 2 + 3 , 28 = 1 + 2 + 4 + 7 + 14
def is_perfect(num):
    sum = 0
    for i in range(1, num):
        if num % i == 0:
            sum += i
    return sum == num

def print_perfect():
    perfect_numbers = []
    for number in range(1, 1001):
        if is_perfect(number):
            perfect_numbers.append(number)
    print(f"Perfect numbers between 1 and 1000 are: {perfect_numbers}")

'''perfect_numbers = []
for number in range(1, 1001):
    if is_perfect(number):
        perfect_numbers.append(number)
print(f"Perfect numbers between 1 and 1000 are: {perfect_numbers}")'''

# Print 1 to 1000 Palindrome Numbers Eg: 121, 131, 141
# Explanation: 121 reversed is 121 , 131 reversed is 131
def is_palindrome(num):
    num_str = str(num)
    return num_str == num_str[::-1] 

def print_palindrome():
    palindrome_numbers = []
    for number in range(1, 1001):
        if is_palindrome(number):
            palindrome_numbers.append(number)   
    print(f"Palindrome numbers between 1 and 1000 are: {palindrome_numbers}")

'''palindrome_numbers = []
for number in range(1, 1001):
    if is_palindrome(number):
        palindrome_numbers.append(number)   
print(f"Palindrome numbers between 1 and 1000 are: {palindrome_numbers}")'''

# Print 1 to 1000 Happy Numbers Eg: 1, 7, 10, 13
# Explanation: 1 -> 1^2 = 1 , 7 -> 7^2 = 49 -> 4^2 + 9^2 = 16 + 81 = 97 -> 9^2 + 7^2 = 81 + 49 = 130 -> 1^2 + 3^2 + 0^2 = 1 + 9 + 0 = 10 -> 1^2 + 0^2 = 1
def is_happy(num):
    seen = set()
    while num != 1 and num not in seen:
        seen.add(num)
        sum = 0
        while num > 0:
            digit = num % 10
            sum += digit ** 2
            num //= 10
        num = sum
    return num == 1

def print_happy():
    happy_numbers = []
    for number in range(1, 1001):
        if is_happy(number):
            happy_numbers.append(number)
    print(f"Happy numbers between 1 and 1000 are: {happy_numbers}")

'''happy_numbers = []
for number in range(1, 1001):
    if is_happy(number):
        happy_numbers.append(number)
print(f"Happy numbers between 1 and 1000 are: {happy_numbers}")'''

# Print 1 to 1000 Automorphic Numbers Eg: 5, 6, 25
# Explanation: 5^2 = 25 , 6^2 = 36 , 25^2 = 625
def is_automorphic(num):
    square = num * num
    num_str = str(num)
    square_str = str(square)
    return square_str.endswith(num_str)

def print_automorphic():
    automorphic_numbers = []
    for number in range(1, 1001):
        if is_automorphic(number):
            automorphic_numbers.append(number)
    print(f"Automorphic numbers between 1 and 1000 are: {automorphic_numbers}")
 
'''automorphic_numbers = []
for number in range(1, 1001):
    if is_automorphic(number):
        automorphic_numbers.append(number)
print(f"Automorphic numbers between 1 and 1000 are: {automorphic_numbers}")'''

# Print 1 to 1000 Kaprekar Numbers Eg: 45
# Explanation: 45^2 = 2025 -> 20 + 25 = 45
def is_kaprekar(num):
    square = num * num
    square_str = str(square)
    d = len(str(num))
    left_str = square_str[:-d] if square_str[:-d] else '0'
    right_str = square_str[-d:]
    left = int(left_str)
    right = int(right_str)
    return (left + right) == num

def print_kaprekar():
    kaprekar_numbers = []
    for number in range(1, 1001):
        if is_kaprekar(number):
            kaprekar_numbers.append(number)
    print(f"Kaprekar numbers between 1 and 1000 are: {kaprekar_numbers}")

'''kaprekar_numbers = []
for number in range(1, 1001):
    if is_kaprekar(number):
        kaprekar_numbers.append(number)
print(f"Kaprekar numbers between 1 and 1000 are: {kaprekar_numbers}")'''

# Print 1 to 1000 Special Numbers Eg: 1, 2, 145
# Explanation: 1! = 1 , 2! = 2 , 145! = 1! + 4! + 5! = 145
def is_special(num):
    sum = 0
    temp = num
    while temp > 0:
        digit = temp % 10
        fact = 1
        for i in range(1, digit + 1):
            fact *= i
        sum += fact
        temp //= 10
    return sum == num

def print_special():
    special_numbers = []
    for number in range(1, 1001):
        if is_special(number):
            special_numbers.append(number)
    print(f"Special numbers between 1 and 1000 are: {special_numbers}")

'''special_numbers = []
for number in range(1, 1001):
    if is_special(number):
        special_numbers.append(number)
print(f"Special numbers between 1 and 1000 are: {special_numbers}")'''

# Print 1 to 1000 Smith Numbers Eg: 4, 22, 27
# Explanation: 4 = 2 * 2 -> (2 + 2) = 4 , 22 = 2 * 11 -> (2 + 1 + 1) = 4 , 27 = 3 * 3 * 3 -> (3 + 3 + 3) = 9
def prime_factors(num):
    i = 2
    factors = []
    while i * i <= num:
        if num % i:
            i += 1
        else:
            num //= i
            factors.append(i)
    if num > 1:
        factors.append(num)
    return factors  
def digit_sum(num):
    sum = 0
    while num > 0:
        digit = num % 10
        sum += digit
        num //= 10
    return sum
def is_smith(num):
    factors = prime_factors(num)
    factor_digit_sum = sum(digit_sum(factor) for factor in factors)
    num_digit_sum = digit_sum(num)
    return factor_digit_sum == num_digit_sum

def print_smith():
    smith_numbers = []
    for number in range(1, 1001):
        if is_smith(number):
            smith_numbers.append(number)
    print(f"Smith numbers between 1 and 1000 are: {smith_numbers}")

'''smith_numbers = []
for number in range(1, 1001):
    if is_smith(number):
        smith_numbers.append(number)
print(f"Smith numbers between 1 and 1000 are: {smith_numbers}")'''