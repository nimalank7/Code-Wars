=begin Sum of digital roots
A digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n.
If that value has two digits, continue reducing in this way until a single-digit
number is produced.
This is only applicable to the natural numbers.
Examples:
digital_root(16)
1 + 6
7
digital_root(942)
9 + 4 + 2
15
1 + 5
6
=end
=begin requirements
1. split the input into an array using .split("")
2. then iterate through the array and add it to a variable = 0
=end

def digital_root(n)
  def sum_digits(n)
    digits = n.to_s.split("") # This will be ["1", "3", "2", "1", "8", "9"]
    sum = 0
    digits.each do |number|
      sum += number.to_i
    end
    sum
  end
  value = sum_digits(n)
  loop do
    if value.to_s.length == 1
      return value
    else
      value = sum_digits(value)
    end
  end
end
puts digital_root(9421)
