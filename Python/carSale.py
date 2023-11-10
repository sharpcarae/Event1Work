companies = []
sales = []
with open("carSale.csv") as file:
    lines = file.readlines()

for i in range(0,len(lines),2):
    companies.append(lines[i].strip())
    data = lines[i+1].strip().split(',')
    sales.append(list(map(int,data)))

totals = 0 
print(companies)
print(sales)
for entry in sales:
    totals += sum(entry)
print(totals)

grandtotal = 0
for entry in sales:
    for value in entry:
        grandtotal += value


for i in range(8):
    sum = 0
    for entry in sales:
        sum += entry[i]
    print(sum)

# month1 = sales[0][0] + sales[1][0]
# month2 = sales[0][1] + sales[1][1]
# month3 = sales[0][2] + sales[1][2]
# addedFord = sum(sales[0])
# addedVolk = sum(sales[1])
# addedMers = sum(sales[2])
# addedVaux = sum(sales[3])
# addedBMW = sum(sales[4])
# print(addedFord)


