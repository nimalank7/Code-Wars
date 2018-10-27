=begin Take a number and sum its digits raised to the consecutive powers and
eureka!
89 = 8^1 + 9^2 = 89
135 = 1^1 + 3^2 + 5^3 = 135
We want a function that given an inclusive range [a, b] will return the numbers
which satisfy this property
Examples:
sum_dig_pow(1, 10) == [1, 2, 3, 4, 5, 6, 7, 8, 9]
sum_dig_pow(1, 100) == [1, 2, 3, 4, 5, 6, 7, 8, 9, 89]
if no numbers it should output the empty array
=end
=begin requirements
1. We need to iterate through all the numbers
2. Then we need to go through each digit of that numbers
We can do this by converting to string then splitting with ("")
Then we loop through the array converting the digits to integers
3. We need to + 1 then sum up their consecutive digits together
4. Then we need to check whether that is equal to the original number
5. Then if it is equal we need to push it into the array
6. If it is not equal then we don't push it into the array

=end
def sum_dig_pow(a,b)
  eureka_numbers = [] # Where we store the array
  a.upto(b) do |number|
    number_length = number.to_s.length
    digits = number.to_s.split("") # This will return an array of the numbers
    index = 0
    sum = 0
    while index < number_length
      sum += digits[index].to_i ** (index + 1) # Multiplying by the power
      index += 1
    end
    if number == sum
      eureka_numbers << number
    end
  end
  eureka_numbers # Our implicit return
end
puts sum_dig_pow(50, 150)
