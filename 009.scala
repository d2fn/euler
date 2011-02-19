val q = "There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc."

var ans = 1L

for(a <- 1 to 1000) {
  for(b <- 1 to 1000) {
    for(c <- 1 to 1000) {
      if((a*a + b*b) == c*c && a + b + c == 1000) {
        ans = a*b*c
      }
    }
  }
}

println(q + ": " + ans)
