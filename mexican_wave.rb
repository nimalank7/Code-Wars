=begin Mexican Wave
Create a function that turns a string into a Mexican Wave. You will be passed
a string and you must return that string in an array where an uppercase letter
is a person standing up.
Always will be a lowercase but empty.
If the character in the string is whitespace then pass over it as if it were
an empty seat

Examples:
"hello" => "Hello" "hEllo" "heLlo" "helLo" "hellO"
"two words" =>
=end

def wave(input)
  mexican_wave = []
  last_index_on_string = input.length - 1
  string = input
  0.upto(last_index_on_string) do |n|
    if input[n] != " "
      string[n] = string[n].upcase
      variable = string.clone # Ruby is a pass by memory reference
      mexican_wave.push(variable)
      string[n] = string[n].downcase
    end
  end
  puts mexican_wave
end
wave("hellogoodbye")
