import math
input_integer = 1001

sum = 0
digit = input_integer % 10
sum += (digit * (2 ** 0))
input_integer  = input_integer// 10

digit = input_integer % 10
sum += (digit * (2 ** 1))
input_integer  = input_integer// 10

digit = input_integer % 10
sum += (digit * (2 ** 2))
input_integer  = input_integer// 10

digit = input_integer % 10
sum += (digit * (2 ** 3))
input_integer  = input_integer// 10

print(sum)
sum = 0
input_integer = input('Enter a binary number: ')
input_length = len(input_integer)

for digit in input_integer:
	input_length = input_length - 1
	digit = int(digit)
	sum += (digit * (2 ** input_length))
print(sum)


sum = 0

for digit_num in range(len(input_integer)):
	digit = digit_num % 10
	sum += digit * (2 ** input_integer)
	digit_num = digit_num // 10
print(sum)
	
	 
	
	
	
