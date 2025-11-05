def SpOoKyCaSe(word):

    word = word.replace("-", "~").replace("_", "~")
    check = True
    new_word = ""

    for c in word:
        
        if c == '~':
            new_word += '~'
            continue
        elif c.isalpha():
            if check:
                new_word += c.upper()
            else:
                new_word += c.lower()
        else:
            new_word += c
        check = not check

    return new_word

print(SpOoKyCaSe("hello_world"))
print(SpOoKyCaSe("spooky-case"))
print(SpOoKyCaSe("a_b-c"))
print(SpOoKyCaSe("var_1-name"))

