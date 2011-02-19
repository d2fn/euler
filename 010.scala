import euler.Functions._

var q = "Find the sum of all the primes below two million."

var ans = (1L to 2000000L).filter(isPrime).reduceLeft(_+_)

println(q + ": " + ans)