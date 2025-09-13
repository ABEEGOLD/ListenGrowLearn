largest = 0
secondLargest = 0
count = 0
while count < 10:
	number = int(input('Enter a number:'))
	count += 1

	if number > largest:
		secondLargest = largest
		largest = number
	elif number > secondLargest and number != largest:
		secondLargest = number
print("first largest:",largest)
print("second largest:",secondLargest)
		