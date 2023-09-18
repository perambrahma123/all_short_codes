a=int(input())
if a==int(str(a)[::-1]): #first a is coneverted into string and reverse the string and then we convert it into int value 
    print("palindrome")  #if condition is satisfied then prints palindrome 
else:
    print("not palindrome") #else not palindrome
