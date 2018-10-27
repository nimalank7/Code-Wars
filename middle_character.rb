=begin Get the middle character
You are going to be given a word. Your job is to return the
middle character of the word. If the word's length is odd,
return the middle character. If the word's length is even,
return the middle 2 characters
"test" should return "es"
"testing" should return "t"
=end
def get_middle(str)
  a = str.length
  a % 2 == 0 ? str[(a/2)-1] + str[(a/2)] : str[a/2]
end
puts get_middle("testes")
