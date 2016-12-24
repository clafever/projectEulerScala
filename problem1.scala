// note that until is inclusive, to is not

var list = (1 until 1000)
var subset = list.filter(n => (n % 3 == 0 || n % 5 == 0 ))
var result = subset.sum

println(result)

// idiomatic way
var result2 = (1 until 1000).filter(n => (n % 3 == 0 || n % 5 == 0 )).sum

println(result2)