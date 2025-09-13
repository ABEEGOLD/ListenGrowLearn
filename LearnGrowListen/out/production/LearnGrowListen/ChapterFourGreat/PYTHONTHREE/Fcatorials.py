number = int(input('Enter a number:'))

fact = 1
for num in range(number,0,-1):
	fact *=num
	print("Factorial:", num, 'is', fact)
	#print(f'factorial: {fact}')