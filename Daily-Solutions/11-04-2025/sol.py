String = input('Enter a string: ')

String = String.replace('_', '~').replace('-', '~')
String = String.capitalize()

Output = []
upper = True
for char in String:
    if char.isalpha():
        Output.append(char.upper() if upper else char.lower())
        upper = not upper
    else:
        Output.append(char)

print("".join(Output))
