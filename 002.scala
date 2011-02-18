import euler.Functions._
val q = "By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms"
val ans = (1 to 33).map(fib).filter(_%2==0).reduceLeft(_+_) 
println(q + ": " + ans)