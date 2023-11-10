time1 = input('enter day/time 1 DD:HH:MM format\n')
time2 = input('enter day/time 2 DD:HH:MM format\n')
splittime1 = time1.split(':')
splittime2 = time2.split(':')
time1Days = int(splittime1[0])
time1Hours = int(splittime1[1])
time1Minutes = int(splittime1[2])
time2Days = int(splittime2[0])
time2Hours = int(splittime2[1])
time2Minutes = int(splittime2[2])

print('''
Time Calculator
1. Add 2 times
2. Find the difference between 2 times
3. Convert to hours
4. Convert to minutes
5. Convert minutes to time
6. convert hours to time
7. Convert days to time
8. Exit
''')
menu = int(input('enter a number:\n'))
if (menu>8 or menu <1):
    print('invalid number try again')
elif (menu == 1):
    totalDays = time1Days+time2Days
    totalHours = time1Hours+time2Hours
    totalMinutes = time1Minutes+time2Minutes

    totalHours ++ int(totalMinutes/60)
    totalMinutes %= 60
    totalDays += int(totalHours/24)
    totalHours %= 24

    result = str(totalDays) + ':' + str(totalHours) + ':' + str(totalMinutes)
    print('Result:', result)
elif (menu == 2):
    
    hours = int(splittime2[1]) - int(splittime1[1])
    minutes = int(splittime2[2]) - int(splittime1[2])
    print(hours,':', minutes)