=begin
Write Number in Expanded Form
You will be given a number and you will need to return it as a string in
Expanded Form. For example:

expanded_form(12); Should return '10 + 2'
expanded_form(42); Should return '40 + 2'
expanded_form(70304); Should return '70000 + 300 + 4'
note: All numbers will be whole numbers greater than 0
=end
=begin
Requirements
Convert input to string then count
Then split string to array using "" - call that split_number
If there are 2 then I need to do 10^0 and 10^1 etc... (so I have to do count-1)
I can do 0.upto x where x is the amount of digits
then do split_number[n]*(10**n)
=end

def expanded_form(num)
  number = num.to_s # This will be "12"
  num_digits = num.to_s.length
  split_number = number.split("").reverse # This will be ["2","1"]
  expanded_array = []
  0.upto(num_digits-1) do |n| # This will be 0 up to 1
    single_split_number = split_number[n].to_i*(10**n)
    next if single_split_number == 0
    expanded_array << single_split_number.to_s
   end
  expanded_array.reverse! # This will be ["10","2"]
  output_array = expanded_array.join(" + ") # Final statement
end
value = expanded_form(1343453)
puts value
