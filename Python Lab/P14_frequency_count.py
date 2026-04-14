# Write a program to count frequency of characters in a given file. Can you use character frequency to tell whether the given file is a Python program file, C program file or a textfile? 

def count_char_frequency(filename):
    char_count = {}
    try:
        with open(filename, "r", encoding="utf-8") as file:
            text = file.read()
            for char in text:
                if char in char_count:
                    char_count[char] += 1
                else:
                    char_count[char] = 1
        return char_count
    except FileNotFoundError:
        print("File not found!")
        return {}

# Example usage
filename = "example.txt"   # change to your file name
result = count_char_frequency(filename)
print(result)

def guess_file_type(char_count):
    if char_count.get(';', 0) > 10 and char_count.get('{', 0) > 5:
        return "Likely a C program file"
    elif char_count.get(':', 0) > 10 and char_count.get('#', 0) > 5:
        return "Likely a Python program file"
    else:
        return "Likely a text file"

# Example usage
file_type = guess_file_type(result)
print(file_type)

