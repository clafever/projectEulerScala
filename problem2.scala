def fib(f1: Int, f2: Int, lim: Int): Int = {
	var f = f1 + f2
	if (f2 > lim) 0
	else if (f2 % 2 == 0) f2 + fib(f2, f, lim)
	else fib(f2, f, lim)
}

println(fib(1,2,4000000))

// kick off with 1,2,4mil
// define a new number

// stop if we hit 4 million by adding 0 to previous sum
// if its divisible by 2 (even) then accumulate recursively
// otherwise carry on with the new number...