=begin Longest Palindrome
Find the length of the longest substring in the given string s that is the
same in reverse.
As an example, if the input was "I like racecars that go fast" the substring
(racecar) length would be 7
Examples:
"a" -> 1
"aab" -> 2
"abcde" -> 1
"zzbaabcd" -> 3
"" -> 0
=end
=begin requirements
1. Select the first letter of the string
2. Then select the 2nd letter of the string
3. In the 2nd iteration select the letter then return the spliced substring
4. Check if the substring is identical reversed
5. If it is identical then record the length and store it into an array
6. Then move onto the 3rd letter of the string and repeat (3-5)
7. Once this is done then move onto the 2nd letter of the string and repeat
steps (3-7) but starting with the 2nd letter of the string etc...
=end

def longest_palindrome(input)
  string = input
  string_length = string.length
  first_digit_index = 0
  length_of_palindromes = [0]
  second_digit_index = 0

  while first_digit_index < string_length
    while second_digit_index < string_length
      spliced_string = string[first_digit_index..second_digit_index]
      if spliced_string == spliced_string.reverse
        puts spliced_string # Make sure to put this
        length_of_palindromes << spliced_string.length
      end
      second_digit_index +=1
    end
    first_digit_index +=1
    second_digit_index = first_digit_index
  end
  length_of_palindromes.sort!
  last_index = length_of_palindromes.length - 1
  length_of_palindromes[last_index]
end
puts longest_palindrome("")
