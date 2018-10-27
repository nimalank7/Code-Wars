=begin
We are sort ascending odd numbers but the even numbers retain their place.
=end
# [5, 3, 2, 8, 1, 4, 11] gives [1, 3, 2, 8, 5, 4, 11]
source_array = [5, 3, 2, 8, 1, 4, 11]
def sort_array(source_array)
  #Use each to return an array with just the odd numbers using an if statement
  #Put the element into an array and put the index into another array
  if source_array == []
    return source_array
  else
  odd_array = [] # [1, 3, 5, 11] sorted
  array_with_index = [] # This is [0, 1, 4, 6]
  n = 0
  source_array.each do
    |number|
    if number % 2 != 0
      odd_array << number # This returns the odd numbers
      array_with_index << n #Returns positions of odd numbers
    end
    n+=1
  end
  odd_array.sort! # Sort the odd array
  odd_array_index = 0
  array_with_index.each do # Now we loop through the array index
    |index|
    source_array[index] = odd_array[odd_array_index]
    odd_array_index += 1 # This makes sure we go from 0,1... in the odd array
  end
  return source_array
end
end
puts sort_array(source_array)