first_Number = (input('Enter the first number:')
second_Number = (input('Enter the first number:')
third_Number = (input('Enter the first number:')

sum = first_Number + second_Number + third_Number
print('Sum:',sum)

average = sum / 3
print('Average:',average)

product = first_Number * second_Number * third_Number
print('Product:',product)

smallest = firstNumber
largest = firstNumber

if second_Number < smallest:
	smallest = second_Number

if third_Number < smallest:
	smallest = third_Number 

	print('Smallest:',smallest)


if second_Number > largest:
	largest = second_Number

if third_Number > largest:
	largest = third_Number 

	print('Largest:',largest)