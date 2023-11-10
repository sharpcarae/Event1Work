grade = int(input("Enter the grade:\n"))
if (grade < 1 or grade > 100):
    print('Error, marks must be between 1 and 100')
level = int(input("Enter students level\n"))
if (level <1 or level >2):
    print('Level can only be 1 or 2')
if(level == 1):
    if (grade < 50):
        print('Fail')
    elif (grade >= 50 and grade <=60):
        print ('pass')
    elif (grade >= 61 and grade <= 70):
        print('merit')
    elif (grade >= 71 and grade <= 100):
        print('distinction')
if(level == 2):
    if (grade < 40):
        print('Fail')
    elif (grade >= 40 and grade <=50):
        print ('pass')
    elif (grade >= 51 and grade <= 65):
        print('merit')
    elif (grade >= 66 and grade <= 100):
        print('distinction')