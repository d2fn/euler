import euler.Functions._
import scala.math._

val q = "What is the smallest positive " +
        "number that is evenly divisible by " +
        "all of the numbers from 1 to 20?"    

val divisors = 1L to 20L

var candidates =
  for(i <- 1L to pow(2,20).toLong)
    yield
      divisors.filter{ x =>
        val mask = 1<<(x-1)
        (mask & i) == mask
      }.foldLeft(1L)(_*_)
  
val ans = candidates.filter(hasDivisors(_,divisors)).reduceRight(_ min _)

println(q + ": " + ans)