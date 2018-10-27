=begin Remove duplicates

kata 3 [1, 1, 3] => [1, 3]

You are to write a function called unique that takes an array of integers and
returns the array with duplicates removed.
It must return the values in the same order as first seen in the given array.
Thus no srting should be done, if 52 appears before 10 in the given array then it should also
be that 52 appears before 10 in the returned array.
=end

def unique(integers)
new_array = []
integers.each do
  |y|
  count = 0
    integers.each do
      |x|
      if y == x
        count += 1
      end
    end
    if count == 1
      new_array.push(y)
    elsif count > 1 && (!new_array.include? y)
      new_array.push(y)
    end
  end
  puts unique([1,1,3])