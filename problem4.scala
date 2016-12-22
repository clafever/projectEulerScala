// find the max palindrome in the products of all three digit numbers
// this could easily be done in a one-liner
// i just run this in the shell because I'm lazy

val answer = (100 to 999).toList
	.flatMap(i => (i to 999).map(n => n*i))
	.filter((n:Int) => n.toString == n.toString.reverse)
	.max

println(answer)


/*
//more intuitively:
val threeDigitNumbers = (100 to 999).toList
val products = threeDigitNumbers.flatMap(i => (i to 999).map(n => n*i))
val palindromes = products.filter((n:Int) => n.toString == n.toString.reverse)
val answer = palindromes.max
*/
