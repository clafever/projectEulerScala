/* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. */

// isolate the ones that sum to what we want
def sumsToN(x: Int, y: Int, z: Int, n: Int): Option[(Int, Int, Int)] = {
	if(x + y + z == n) Some( (x,y,z) ) 
	else None
}

// further isolate into triples
def isTriple(x: Int, y: Int, z: Int): Option[(Int, Int, Int)] = { 
	if( Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) )  Some( (x,y,z) ) 
	else None
}

// actually lets just combine them both into one function
def master(x: Int, y: Int, z: Int, n: Int): Option[(Int, Int, Int)] = {
	if ((x + y + z == n) && ( Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) )) Some( (x,y,z) )
	else None
}

// list of candidates
var a = (1 to 1000).toList

// run them through the master
var sets = a.flatMap(x => a.flatMap( y => a.flatMap( z => master(x,y,z, 1000) ) ) )

// extract from evil tuples and take the first one (since they should be equal)
var products = sets.map{case(x,y,z) => x * y * z }.head

// display result
println(products)