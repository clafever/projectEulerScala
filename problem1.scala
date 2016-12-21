/* Note that this could be chained together in one line */


// make a list of the numbers 
var list = (1 until 1000)

// filter them such that 3 OR 5 is a divisor
var subset = list.filter(n => (n % 3 == 0 || n % 5 ==0 ))

// add them up
var result = subset.sum

// print to console 
println(result)