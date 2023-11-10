print(
'''
Pythagoras' Calculator
1. Find the length of A given B and C
2. Find the length of B given A and C
3. Find the length of C given A and B
'''
)
option = int(input('Please select an option\n'))
if (option < 1 or option > 3):
    print('Invalid selection, please select one of the options from the menu')
if(option == 1):
    lengthb = float(input('What is the length of B?\n'))
    lengthc = float(input('What is the length of C?\n'))
    calculationA = (lengthc**2 - lengthb**2)**0.5
    print("Length of A is ", calculationA)
elif(option ==2):
    lengtha = float(input('What is the length of A?\n'))
    lengthc = float(input('What is the length of C?\n'))
    calculationB = (lengthc**2 - lengtha**2)**0.5
    print("Length of B is ", calculationB)
elif(option==3):
    lengtha = float(input('What is the length of A?\n'))
    lengthb = float(input('What is the length of B?\n'))
    calculationC = (lengtha**2 + lengthb**2)**0.5
    print("Length of C is ", calculationC)