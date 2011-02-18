val q = "Find the sum of all the multiples of 3 or 5 below 1000"
val ans = (3 until 1000).filter(x=>x%3==0||x%5==0).reduceLeft(_+_) 

println(q + ": " + ans)