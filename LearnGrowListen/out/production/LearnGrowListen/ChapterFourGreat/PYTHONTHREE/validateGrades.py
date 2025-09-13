failure = 0
passes = 0

count = 1

while(True):
    userInput = int(input('Enter a valid grades(1=passes,2=failure):'))
    if userInput == -1:
       break
       print('Count:',count)
    if userInput != 1 and userInput != 2:
       print('Enter a valid input')    
	
    if userInput == 1:
        passes = passes + 1

    else:
        failure = failure + 1
print('The passes is:',passes)
print('The failure is:',failure)
print('Count:',count)

