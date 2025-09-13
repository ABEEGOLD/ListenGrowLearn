input_number = (input('Enter a digits:'))

digitOne = number // 10000;
digitTwo = (number // 1000) % 10;
digitThree = (number //100) % 10;
digitFour = (number // 10) % 10;
digitFive = (number % 10);

print(f"{digitOne}\t{digitTwo}\t{digitThree}\t{digitFour}\t{digitFive}")
