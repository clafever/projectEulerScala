// I'll take it

def f(v:Int): Int = {
	if ((1 to 20).map(n => v % n).sum != 0) f(v+20)
	else v
}

println(f(20))

