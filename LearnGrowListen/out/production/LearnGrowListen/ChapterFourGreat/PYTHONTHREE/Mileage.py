total_mile = 0.0
total_gallon = 0.0

while True:
	miles = int(input('Enter miles used(or -1 to end):'))
	if miles == -1:
		break
	gallons = int(input('Enter gallon used(or -1 to end):'))
	if gallons == -1:
		break



	mgn = miles // gallons
	print(f'{"MGN IS:"}{mgn:>10.2f}')

	total_mile += miles
	total_gallon += gallons

if total_gallon != 0:
	cmgn = total_mile // total_gallon
	cmgn *= mgn
	print(f'{"CMGN is:"}{cmgn:>10.2f}')


