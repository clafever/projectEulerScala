

// sum of the squares o the first 1000
// square of the sum of the first 1000

def square(n: Int): Int = n * n

val n = (1 to 100)

val r = square(n.sum) - n.map(n=>square(n)).sum

println(r)