import statistics
data = "100,30,53,67,85,87,50,45,51,72,64,69,59,17,22,23,44,25,16,67,85,87,50,45,51,72,59,14,50,55,32,23,24,25,37,28,39,30,33,35,40,34,41,43,94,95,59,98,99,44,45,47,48,49,53,61,63,69,75,77,60,83"
grades = data.split(',')
grades = list(map(int, grades))
# print(grades)
# grades.sort()
print(grades)
minimum = min(grades)
maximum = max(grades)
print(minimum)
print(maximum)
length = len(grades)
added = sum(grades)
average = round((added/length), 2)
print('Average = ', + average)

mean = statistics.mean(grades)
totalmean = round(mean, 2)
print('Mean is ', + totalmean)

median = int(statistics.median(grades))
print('Median is ', + median)

str = "Miniumn value is {}, Maximum value is {}, Average is {}, Mean is {}, Median is {}".format(minimum, maximum, average, totalmean, median)
print(str)