// not proud of this but it works
// could make more elegant with composed functions or closure

def fib(f1: Int, f2: Int, lim: Int): Int = {
	var f = f1 + f2
	if (f2 > lim) 0
	else if (f2 % 2 == 0) f2 + fib(f2, f, lim)
	else fib(f2, f, lim)
}

println(fib(1,2,4000000))
