// square of sum vs sum of squares
def square(n: Int): Int = n * n

val n = (1 to 100)

val r = square(n.sum) - n.map(n=>square(n)).sum

println(r)
