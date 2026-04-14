# Write a program to print each line of a file in reverse order.

def reverse_lines(file_name):
    with open(file_name,"r") as f:
        lst_lines= f.readlines()
        for line in reversed(lst_lines):
            print(line.rstrip())

reverse_lines('sample.txt')

# Another way to reverse lines in a file
def print_lines_in_reverse(filename):
    try:
        with open(filename, "r", encoding="utf-8") as file:
            for line in file:
                # Strip newline, reverse the string, then print
                print(line.strip()[::-1])
    except FileNotFoundError:
        print("File not found!")

# Example usage
print_lines_in_reverse("sample.txt")

# Write a program to compute the number of characters, words and lines in a file. 

def stats(file_name):
    with open(file_name,"r") as file:
        lines_count = 0
        char_count = 0
        word_count = 0
        for line in file:
            lines_count = lines_count + 1
            char_count = char_count + len(line)
            words = line.split()
            word_count = word_count +len(words)
    return lines_count,char_count,word_count

l_C,c_c,w_c = stats('sample.txt')
print(f"Lines count is:{l_C}")
print(f"char count is:{c_c}")
print(f"word count is:{w_c}")

# or 

def file_statistics(filename):
    try:
        with open(filename, "r", encoding="utf-8") as file:
            text = file.read()
            
            # Count characters
            num_chars = len(text)
            
            # Count words (split by whitespace)
            num_words = len(text.split())
            
            # Count lines
            file.seek(0)  # reset pointer
            num_lines = sum(1 for line in file)
            
            print(f"Characters: {num_chars}")
            print(f"Words: {num_words}")
            print(f"Lines: {num_lines}")
    except FileNotFoundError:
        print("File not found!")

# Example usage
file_statistics("sample.txt")

