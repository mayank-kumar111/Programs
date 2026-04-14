# Write a program to count the numbers of characters in the string and store them in a dictionary data structure

def count_characters(s):
    char_count = {}
    for char in s:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    return char_count

# Example usage
string = "Mayank Kumar"
result = count_characters(string)
print(result)

# Write a program to use split and join methods in the string and trace a birthday of a person with a dictionary data structure 

birthday_friends = {
   "Mayank":"20/10/2005",
   "Jags":"17/09/1987",
   "Ritu":"27/08/1989", 
}

def get_birthday(name):
    # Get the birthday string from dictionary
    date_string = birthday_friends.get(name)
    
    # Split the string into parts [day, month, year]
    date_parts = date_string.split("/")
    
    # Join the parts back with a different separator
    formatted_date = "-".join([date_parts[0], date_parts[1], date_parts[2]])
    
    print(formatted_date)

get_birthday("Mayank")


# Program to use split and join with dictionary for birthdays

def trace_birthday(birthday_dict, name):
    if name in birthday_dict:
        # Split the birthday string into parts
        date_parts = birthday_dict[name].split("-")  # format: DD-MM-YYYY
        print(f"{name}'s birthday details:")
        print(f"Day: {date_parts[0]}")
        print(f"Month: {date_parts[1]}")
        print(f"Year: {date_parts[2]}")

        # Join the parts back into a string with a different separator
        joined_date = "/".join(date_parts)
        print(f"Formatted birthday: {joined_date}")
    else:
        print(f"No birthday record found for {name}")

# Example dictionary storing birthdays
birthdays = {
    "mayank": "12-05-1995",
    "kumar": "23-11-1990",
    "Charlie": "01-01-2000"
}

# Example usage
trace_birthday(birthdays, "mayank")
trace_birthday(birthdays, "Charlie")