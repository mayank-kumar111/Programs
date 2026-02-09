import P3_module_demo
print(f"Module name is : {P3_module_demo.__name__}")
print(f"The value of x is : {P3_module_demo.x}")

import P3_module_demo as md # using alias
print(f"The value of y is : {md.y}")

from P3_module_demo import add, product
sum_result = add(100, 200)
product_result = product(10, 20)    
print(f"The sum of 100 and 200 is : {sum_result}")
print(f"The product of 10 and 20 is : {product_result}")

