input_number = int(input('Enter a digits:'))

digitOne = input_number // 10000 % 10
digitTwo = input_number // 1000 % 10;
digitThree = input_number //100 % 10;
digitFour = input_number // 10 % 10;
digitFive = input_number % 10;

if digitOne == digitFive and digitTwo == digitFour:
	print("palindrome")

else:
	print("Not palindrome") 
print("PALINDROME IS:",digitOne,digitTwo,digitThree,digitFour,digitFive)