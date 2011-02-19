package euler

import scala.math._

object Functions {
  
  def max(a:Long,b:Long):Long = a > b match {
    case true => a
    case _    => b
  }
  
  def min(a:Long,b:Long):Long = a < b match {
    case true => a
    case _    => b
  }
  
  /** fibonacci sequence **/
  def fib(n:Int):Long = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1) + fib(n-2)
  }
  
  def fac(n:Int):Long = n match {
    case 1 => 1
    case _ => n * fac(n-1)
  }
  
  def largestPrimeFactor(n:Long,divisor:Long=2):Long = {
    val n2 = n/divisor
    if(n%n2 == 0 && isPrime(n2)) {
      n2
    }
    else {
      largestPrimeFactor(n,divisor+1)
    }
  }
  
  def hasDivisors(n:Long, divisors:Seq[Long]) = {
    divisors.filter(n%_ > 0).isEmpty
  }
  
  /*
  def largestPrimeFactor(n:Long):Long = {
    var test = n/2L
    if(n)
    while(test > 1) {
      if(n%test == 0 && isPrime(test)) {
        return test
      }
      test = test - 1
    }
    return 1
  }
  */

  /** prime tests **/
  def isPrime(n:Int):Boolean = {
    if(n < 2) return false
    val hi = floor(sqrt(n)).toInt
    for(i <- 2 to hi) {
      if(n%i == 0) {
        return false
      }
    }
    return true
  }
  def isPrime(n:Long):Boolean = {
    if(n < 2) return false
    val hi = floor(sqrt(n)).toLong
    for(i <- 2L to hi) {
      if(n%i == 0) {
        return false
      }
    }
    return true
  }  

  def isPalindrome(test:String, index:Int = 0):Boolean = {
    if(index > test.size/2) return true
    val left   = test(index)
    val right  = test(test.size-index-1)
    (left == right) match {
      case true  => isPalindrome(test,index+1)
      case false => false
    }
  }

  def findLargestPalindrome(fw:String):String = {
    var palindromes = List[String]()
    // detect odd length strings
    for(i <- 1 until fw.size - 1) {
      var buffer = String.valueOf(fw(i))
      // detection radius
      var r = 1
      while(fw(i-r) == fw(i+r)) {
        val c = fw(i-r)
        buffer = c + buffer + c
        r = r + 1
      }
      if(buffer.length > 1) {
        palindromes ::= buffer
      }
    }
    
    for(i <- 1 until fw.size - 1) {
      if(fw(i) == fw(i+1)) {
        var buffer = String.valueOf(fw(i)+fw(i))
        var r = 1
        while(fw(i-r) == fw(i+r+1)) {
          val c = fw(i-r)
          buffer = c + buffer + c
          r = r + 1
        }
        if(buffer.length > 2) {
          palindromes = buffer :: palindromes
        }
      }
    }
    palindromes.sortWith((x,y)=>x.length > y.length).head
  }  
}