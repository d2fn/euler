import euler.Functions._
import scala.math._

val q = "What is the smallest positive " +
        "number that is evenly divisible by " +
        "all of the numbers from 1 to 20?"    

val divisors = (1L to 20L)

var candidates = List[Long]()

for(i <- 1 to pow(2,20).toInt) {
  val d = divisors.filter{ x =>
            val mask = 1<<(x-1)
            (mask & i) == mask
          }
  if(!d.isEmpty) {
    candidates = d.reduceLeft(_*_) :: candidates
  }
}
  
val ans = candidates.filter(hasDivisors(_,divisors)).sortWith((x,y)=>x<y).head

println(q + ": " + ans)