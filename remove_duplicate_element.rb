=begin Delete occurences of an element if it occurs more than n times
Examples:
[20,37,20,21] should return [20, 37, 21] if n is up to 1 times
[1,1,3,3,7,2,2,2,2], 3), [1, 1, 3, 3, 7, 2, 2, 2]
=end

array = [1,1,3,3,7,2,2,2,2]
def delete_nth(array, n)
(array.length-1).downto(0) do # I can't use downto
  |index|
  count = 0
  array.each do
    |element|
    if array[index] == element
      count +=1
    end
  end
  if count > n # This will change to n soon
    array[index] = nil
  end
  end
  returned_array = array.select do
    |new_element|
    new_element != nil
  end
  puts returned_array.to_s
end

delete_nth(array, 3)
