num1 = int(input("enter a number\n"))
num2 = int(input('enter another number\n'))
# print('1. Add        +')
# print('2. Subtract   -')
# print('3. Multiply   *')
# print('4. Divide     /')
# print('5. Square     s')
print(
'''
1. Add        +
2. Subtract   -
3. Multiply   *
4. Divide     /
5. Square     s
''')
operation = input('which operation would you like to perform?\n')
if (operation == '+'):
    total = num1 + num2
    print(total)
elif (operation == '-'):
    total = num1 - num2
    print(total)
elif (operation == '*'):
    total = num1 * num2
    print(total)
elif (operation == '/'):
    total = num1 / num2
    print(total)
elif (operation == 's'):
    total1 = num1 * num1
    total2 = num2 * num2
    print(total1, total2)
else:
    print ('please enter a valid operation')