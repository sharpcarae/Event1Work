vowels = ('a', 'e', 'i', 'o', 'u')
word = input('Please enter a word\n')
count = 0

i = 0 
while(i<len(word)):
    print(word[i])
    i+=1

for i in range(len(word)):
     if word[i] in vowels:
        count +=1

print(count)