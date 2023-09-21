#anagram means two strings contains same alphabets with same length of diffrent words
a=input()
b=input() #taking a and b as two strings input 
if len(a)==len(b): #running only if a and b have same length
    if sorted(a)==sorted(b): #sorting and comparing both a and b 
        print("yes")
    else:
        print("no")
else:
    print("no")
  #time complexity:
  #the overall time complexity of the Python code is O(N * log(N)), where N is the length of the longest input string.
  #space Complexity:
  # the overall space complexity of the Python code is O(N), where N is the length of the longest input string.
