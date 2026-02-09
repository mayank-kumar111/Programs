# Command Line arguments
from sys import argv
print(f"Type of argv is : {type(argv)}")

'''Write a program add.py that takes 2 numbers as command line arguments and prints 
its sum.''' 
'''if len(argv) != 3:
    print("Please provide exactly 2 numbers as command line arguments.")
else:
    try:
        num1 = float(argv[1])
        num2 = float(argv[2])
        sum_result = num1 + num2
        print(f"The sum of {num1} and {num2} is : {sum_result}")
    except ValueError:
        print("Please provide valid numbers as command line arguments.")'''

from sys import argv
cmd_argument = argv[1:]
sum =0
for number in cmd_argument:
    sum += int(number)
print(f"Sum of command line argument is : {sum}")