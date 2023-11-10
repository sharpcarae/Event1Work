attempt = 1
min = 1
max = 100
while (attempt <= 3):
    number = int(input('Enter a number between 1 and 100 :\n'))
    if (number >= min and number <= max):
        print(number)
    else:
        print('Error, please try again')
        attempt = attempt + 1
print(None)

