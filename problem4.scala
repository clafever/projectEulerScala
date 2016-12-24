// run in shell, no boilerplate

val answer = (100 to 999).toList // three digit numbers 
	.flatMap(i => (i to 999).map(n => n*i)) // their products
	.filter((n:Int) => n.toString == n.toString.reverse) // the palindromes
	.max // the biggest one

println(answer)


