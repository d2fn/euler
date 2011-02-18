import euler.Functions._

val q = "Find the largest palindrome made from the product of two 3-digit numbers"

var palindromes = List[Int]()

for(i <- 100 to 999) {
  for(j <- 100 to 999) {
    val product = i*j
    val s = String.valueOf(product)
    if(isPalindrome(s)) {
      palindromes = product :: palindromes
    }
  }
}

val ans = palindromes.sortWith((x,y)=>x>y).head
println(q + ": " + ans)
