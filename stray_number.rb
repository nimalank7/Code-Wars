=begin Find the stray number
You are given an odd-length array of integers, in which all of them are the same, except for one single
number.
Complete the method which accepts such an array, and returns that single different number.
Examples:
[1, 1, 2]==> 2
[17, 17, 3, 17, 17, 17, 17] ===> 3
=end

def stray (numbers)
  sorted_array = numbers.sort!
  sorted_length = numbers.length
  deleted_value = numbers.delete_at(0) # Modifies the array
  if numbers.include?(deleted_value) == false
    deleted_value
  else
    numbers[sorted_length-2]
    end
end
puts stray([1,1,2])

