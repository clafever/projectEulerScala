//doesnt work yet

def primeTest(n: Int): Boolean = {
	if (n < 2) false
	else !(2 to Math.sqrt(n).toInt).exists(d => n % d == 0)
}

println(primeTest(13))

def nthPrime(n: Int): Int = {
	def acc(value: Int, i:Int): Int = {
		if (primeTest(value) == true && n == i) value
		else if (primeTest(value) == true && n < i) acc(value + 1, i + 1)
		else acc(value + 1, i)
	}
	acc(2, 1)
}

println(nthPrime(8))