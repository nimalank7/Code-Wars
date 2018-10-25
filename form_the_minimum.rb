=begin Form the minimum
Given a list of digits return the smallest number that could be formed from
these digits using the digits only once. (Ignore duplicates)
[1, 3, 1] gives 13
[4, 7, 5, 7] gives 45
[4, 8, 1, 4] gives 14
=end
def min_value(digits)
  complete_digits = digits
  array = []
  complete_digits.each do |n|
    if_true = array.include? n
    if if_true != true
    array = array.push(n)
  end
end
  puts array.sort!
  return_number = ""
  array.each do |x|
    return_number = return_number + x.to_s
  end
  return return_number.to_i
end
puts min_value([1, 3, 1])
