ages = [12, 18,33,84,45,67,12,82,95,16,10,23,43,29,40,34,30,16,44,69,70,74,38,65,36,83,50,11,79,64,78,37,3,8,68,22,4,60,33,82,45,23,5,18,28,99,17,81,14,88,50,19,59,7,44,93,35,72,25,63,11,76,10,60,30,14,21,82,47,6,21,88,46,78,92,48,36,28,51]
length = len(ages)
print(length)
# for i in range(len(ages)):
#     print('index', i, '=', ages[i])
# newage = []
# for i in range(len(ages)):
#     newage.append(ages[i]+1)
#     print('index', i, '=', newage[i])
# for i in reversed(range(len(ages))):
#     if (ages[i] < 16):
#         del(ages[i])
#     if (ages[i] > 65):
#         del(ages[i])
# length = len(ages)
# print(length)
# print(ages)

count = 0
for i in range(len(ages)):
    if (ages[i]>16 and ages[i]<25):
        count = count + 1
print(count)

proportion = int((count/length)*100)
print('proportion of 16-25 yos is', proportion, '%')

ages.sort()
print(ages)