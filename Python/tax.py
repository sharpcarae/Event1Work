def getIncomeTax(salary):
    tax = 0 
    if salary <= 11850:
        print('Personal Allowance, no tax paid')
    elif salary > 11850 and salary <= 34500:
        tax = salary * 0.2
    elif salary > 34500 and salary <=150000:
        tax = salary * 0.4
    elif salary > 150000:
        tax = salary * 0.45
    return int(tax)

while True:
    strSalary = input("What is your salary?\n")
    if strSalary.isdigit():
        salary = int(strSalary)
    else:
        print(strSalary + 'is not a valid salary')

    print(getIncomeTax(salary))
    again = input('would you like to make another calculation?(y or n)\n')
    if again == 'y':
        continue
    else:
        break
