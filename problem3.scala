// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?



// take an argument from the command line scala problem3.scala 600851475143
var test_int = BigInt(args(0))

// We only want this to be a function of a big ol integer
def largestPrimeFactor(x :BigInt) = {
	// tail recursion up in this
	def loop(f: BigInt, n: BigInt): BigInt = {
		// if this is indivisible then we've hit the end 
		// think of doing it by hand starting with smallest factors
		if (f == n) n 
		// if f divides n evenly, then jump to the "result" 
		// and see if something divides it starting where we left off
		else if (n % f == 0) loop(f, n / f) 
		// if a bust, move up to the next number
		else loop(f + 1, n) 
	}
	// start with 2 and see if it divides evenly
	loop(BigInt(2), x) 
}

//print to console since we took a shell parameter
println(largestPrimeFactor(test_int))

// the trick is that the largest prime factor is going to be the last number 
// that this works for (since we started with all the smaller ones and its not divisible