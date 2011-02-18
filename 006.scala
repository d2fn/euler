import scala.math._

val q = "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum."

var squareOfSums = pow((1 to 100).reduceLeft(_+_),2).toLong
var sumOfSquares = (1 to 100).map(pow(_,2).toLong).reduceLeft(_+_)

val ans = abs(squareOfSums-sumOfSquares)

println(q + ": " + ans)
