# number = int(input("Please enter a number:\n"))
# fac = 1
# i = 1
# while i <= number:
#     fac = fac*i
#     i = i + 1
# print ('Factorial ', number, "is ", fac)

number = int(input("Please enter a number:\n"))
fac = 1

for i in range(1, number + 1):
    fac = fac*i
    
print ('Factorial ', number, "is ", fac)