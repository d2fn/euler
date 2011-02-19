import euler.Functions._
import scala.math._

val q = "Find the 10001th prime: "

var test = 2
var foundPrimes = 0

while(foundPrimes < 10001) {
  if(isPrime(test)) {
    foundPrimes = foundPrimes + 1
  }
  test = test + 1
}

val ans = test-1

println(q + ": " + ans)