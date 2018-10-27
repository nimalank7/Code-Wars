array = [1, 7, 5, 45, 12, 78, 100]
loop do
swap = 0
0.upto(array.length-2) do
|n|
if array[n] > array[n+1]
  array_element1 = array[n]
  array[n] = array[n+1]
  array[n+1] = array_element1
  swap += 1
end
end
break if swap == 0
end
puts array
