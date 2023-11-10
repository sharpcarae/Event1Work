x = 1
while (x < 100):
    y = x**2
    print (y)
    x = x+1
    if (y > 200):
        break

for x in range(101):
    y = x**2
    print(y)
    if (y > 200):
        break